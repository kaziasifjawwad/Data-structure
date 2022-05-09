public class BST {
    public Node root;

    public void add(int d){
        Node node = new Node(d);
        if(this.root == null){
            this.root = node;
        }else{
            Node focus = root;
            while(true){
                Node parent = focus;
                if(focus.data<d){
                    focus = parent.left;
                    if(focus==null){
                        node.parent = parent;
                        parent.left  = node;
                    }
                }else{
                    focus = parent.right;
                    if(focus==null){
                        parent.right = node;
                        node.parent = parent;

                    }
                }

            }
            
        }

    }
}
