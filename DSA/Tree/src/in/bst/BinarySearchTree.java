package in.bst;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

    public int height(){
        return height(root);
    }

    public int height(Node node){

        if(node==null){
            return -1;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public void display(Node root){
        display(root, "Root node : ");
    }

    private void display(Node node, String nodeInfo){
        if(node==null){
            return;
        }
        System.out.println(nodeInfo + node);

        display(node.left, "Left value of "+node.data+" : ");
        display(node.right, "Right value of "+node.data+" : ");
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if (node==null){
            node =  new Node(value);
            return node;
        }
        if(value < node.data){
            node.left = insert(node.left, value);
        }
        if(value > node.data){
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void insert(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            insert(arr[i]);
        }
    }

    public void insertSortedArray(int[] arr){
        insert(arr, 0, arr.length-1);
    }

    private void insert(int[] arr, int start, int end){
        if(start>end ){
            return;
        }

        int mid = (start+end)/2;
        insert(arr[mid]);

        insert(arr, start, mid-1);
        insert(arr, mid+1, end);

    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node){
        if (node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node){

        if (node==null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    // Print method to display the tree structure
    public void print() {
        print(root, "", true);
    }

    // Helper method to print the tree
    private void print(Node node, String prefix, boolean isTail) {
        if (node != null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
            print(node.left, prefix + (isTail ? "    " : "│   "), false);
            print(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
    }


    private class Node {
        private int data;
        private Node left;
        private Node right;

        private Node() {
        }

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

}
