
import java.util.LinkedList;
import java.util.Queue;

public class Levelorderline {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        void levelOrderTraversal(Node root) {
            Queue<Node> q = new LinkedList<Node>(); // Queue to store the nodes of the tree
            q.add(root); // Add the root node to the queue
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.poll(); // Remove the front node from the queue

                if (temp == null) {
                    System.out.println(); // Print newline for new level

                    // **Fix:** Only add `null` if queue is not empty
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " "); // Print the front node
                    if (temp.left != null) {
                        q.add(temp.left); // Add the left child to the queue
                    }
                    if (temp.right != null) {
                        q.add(temp.right); // Add the right child to the queue
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("levelorder traversal of binary tree is ");
        tree.levelOrderTraversal(tree.root);
    }

}
