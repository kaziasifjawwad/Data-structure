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
                if(d<focus.data){
                    focus = parent.left;
                    if(focus==null){
                        node.parent = parent;
                        parent.left  = node;
                        break;
                    }
                }else{
                    focus = parent.right;
                    if(focus==null){
                        parent.right = node;
                        node.parent = parent;
                        break;

                    }
                }

            }
            
        }

    }

    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");
        }
    }



}
