public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }

    // The number of items on the stack
    public int size(){
        return this.size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        if(size==0){
            return true;
        }return false;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        if(size==this.data.length){
            throw new StackOverflowException();
        }
        this.data[size]=e;
        size+=1;
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        Object temp = this.data[this.size-1];
        this.data[this.size-1]=null;
        this.size-=1;
        return temp;
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        return this.data[this.size-1];
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        if(this.size==0){return "Empty Stack";}
        String string = "";
        for(int i=0;i<this.size;i++){
            string=string+this.data[i]+" ";
        }
        return string;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object object[] = new Object[this.size];
        for(int i=0;i<this.size;i++){
            object[i]=this.data[i];
        }
        return object;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        for(int i=0;i<this.size;i++){
            if (((Comparable)e).compareTo(this.data[i]) ==0){
                return i;
            }
        }
        return -1;
    }
}