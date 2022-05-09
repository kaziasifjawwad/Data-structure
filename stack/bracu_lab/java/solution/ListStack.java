public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }

        // The number of items on the stack
        public int size(){
            return this.size;
        }
        // Returns true if the stack is empty
            public boolean isEmpty(){
                if(this.size==0){
                    return true;
                }return false;
            }
        // Pushes the new item on the stack, throwing the
        // StackOverflowException if the stack is at maximum capacity. It
        // does not throw an exception for an "unbounded" stack, which
        // dynamically adjusts capacity as needed.
            public void push(Object e) throws StackOverflowException{
                Node node = new Node(e,null);
                if(this.top==null){
                    this.top = node;
                }
                else{
                    Node temp = this.top;
                    this.top = node;
                    this.top.next = temp;
                }
                this.size+=1;
            }
        // Pops the item on the top of the stack, throwing the
        // StackUnderflowException if the stack is empty.
            public Object pop() throws StackUnderflowException{
                if(this.size==0){
                    throw new StackUnderflowException();
                }
                Node temp=this.top;
                Object val=temp.val;
                this.top=this.top.next;
                size-=1;
                temp=null;
                return val;
               
            }
        // Peeks at the item on the top of the stack, throwing
        // StackUnderflowException if the stack is empty.
            public Object peek() throws StackUnderflowException{
                if(this.size==0){
                    throw new StackUnderflowException();
                }
                return this.top.val;
            }
        // Returns a textual representation of items on the stack, in the
        // format "[ x y z ]", where x and z are items on top and bottom
        // of the stack respectively.
            public String toString(){
                if(this.size==0){
                    return "Empty Stack";
                }
                String string = "";
                for(Node temp = this.top;temp!=null;temp=temp.next){
                    string=string+" "+temp.val;
                }
                return string;
        }
        // Returns an array with items on the stack, with the item on top
        // of the stack in the first slot, and bottom in the last slot.
            public Object[] toArray(){
                Object object[] = new Object[this.size];
                int i=0;
                for(Node temp = this.top;temp!=null;temp=temp.next){
                    object[i] = temp.val;
                    i++;
                }
                return object;
            }
        // Searches for the given item on the stack, returning the
        // offset from top of the stack if item is found, or -1 otherwise.
            public int search(Object e){
                int i=0;
                for(Node temp = this.top;temp!=null;temp=temp.next){
                    if (((Comparable)e).compareTo(temp.val) ==0){
                        return i;
                    }
                    i++;
                }
                return -1;
            }

}