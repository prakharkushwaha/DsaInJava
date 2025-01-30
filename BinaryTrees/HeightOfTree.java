public class HeightOfTree {
    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // BinaryTree class containing methods to manipulate the tree
    static class BinaryTree {
        Node root;

        // Method to calculate the height of the binary tree
        int heightEdge(Node node) {
            if (node == null) {
                return -1;
            } else {
                // Compute the height of each subtree
                int leftHeight = heightEdge(node.left);
                int rightHeight = heightEdge(node.right);

                // Use the larger one
                return Math.max(leftHeight, rightHeight) + 1;
            }

        }

        int heightNode(Node node) {
            if (node == null) {
                return 0;
            } else {
                // Compute the height of each subtree
                int leftHeight = heightNode(node.left);
                int rightHeight = heightNode(node.right);

                // Use the larger one
                return Math.max(leftHeight, rightHeight) + 1;
            }

        }
    }

    // Main method to test the height calculation
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " + tree.heightEdge(tree.root));
        System.out.println("Height of tree is : " + tree.heightNode(tree.root));
    }
}