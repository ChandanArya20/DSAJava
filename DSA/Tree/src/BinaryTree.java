public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    

    // Print method to display the tree structure
    public void print(Node root) {
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



    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}


