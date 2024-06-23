import in.bst.BinarySearchTree;

public class BSTMain {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {23, 10, 12, 20, 40, 8, 9, 90, 22, 80};
        int[] arr1 = {2, 4, 6, 8, 9, 10, 12, 13, 15};


//        bst.insert(arr);
//        bst.insert(arr1);
        bst.insertSortedArray(arr1);

        bst.print();

        bst.preOrder();
        bst.inOrder();
        bst.postOrder();

        System.out.println("Height of root : "+bst.height());
        System.out.println("Balanced : "+bst.isBalanced());


    }
}