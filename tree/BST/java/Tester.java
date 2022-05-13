public class Tester {
    public static void main(String args[]){
        // int[] data = {5,12,28,38,48,10,22,30,40,20,36,25};
        int[] data = {1,2,3,4,5,6};
        BST bst  = new BST();
        for(int i = 0 ;i<data.length;i++){
            bst.add(data[i]);
        }
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println("\nMax depth is :" + bst.maxDepth(bst.root));
    }
}
