public class Main {
    public static void main(String[] args) {
        // Creating nodes
        Node root = new Node(1);
        Node leftChild = new Node(2);
        Node rightChild = new Node(3);

        // Linking nodes
        root.setLeft(leftChild);
        root.setRight(rightChild);

        // Adding more nodes
        leftChild.setLeft(new Node(4));
        leftChild.setRight(new Node(5));
        rightChild.setLeft(new Node(6));
        rightChild.setRight(new Node(7));

        // Printing nodes
        print(root);

    }

    public static void printTree(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    // Print method to display the tree structure
    public static void print(Node root) {
        print(root, "", true);
    }

    // Helper method to print the tree
    private static void print(Node node, String prefix, boolean isTail) {
        if (node != null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
            print(node.left, prefix + (isTail ? "    " : "│   "), false);
            print(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}