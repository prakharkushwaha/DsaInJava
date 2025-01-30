public class Inorder {
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

        // Method to perform inorder traversal of the binary tree
        void inorder(Node node) {
            if (node == null) {
                return;
            }

            // Traverse the left subtree
            inorder(node.left);

            // Visit the root
            System.out.print(node.data + " ");

            // Traverse the right subtree
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is ");
        tree.inorder(tree.root);
    }

}
