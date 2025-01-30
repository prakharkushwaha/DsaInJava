import java.util.*;

public class TopVIew {

    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    class Pair {
        TreeNode node;
        int hd; // Horizontal distance

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static class TopViewBinaryTree {
        public List<Integer> topView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            // HashMap to store the first node encountered at each horizontal distance
            HashMap<Integer, Integer> topViewMap = new HashMap<>();
            Queue<Pair> queue = new LinkedList<>();

            int minHD = 0; // Track minimum horizontal distance
            int maxHD = 0; // Track maximum horizontal distance

            // Start with the root at horizontal distance 0
            queue.offer(new Pair(root, 0));

            while (!queue.isEmpty()) {
                Pair current = queue.poll();
                TreeNode node = current.node;
                int hd = current.hd;

                // If this horizontal distance is seen for the first time, add to map
                if (!topViewMap.containsKey(hd)) {
                    topViewMap.put(hd, node.data);
                }

                // Update min and max horizontal distances
                minHD = Math.min(minHD, hd);
                maxHD = Math.max(maxHD, hd);

                // Add left and right children with updated horizontal distances
                if (node.left != null) {
                    queue.offer(new Pair(node.left, hd - 1));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, hd + 1));
                }
            }

            // Collect results from minHD to maxHD in order
            for (int hd = minHD; hd <= maxHD; hd++) {
                if (topViewMap.containsKey(hd)) {
                    result.add(topViewMap.get(hd));
                }
            }

            return result;
        }

        public static void main(String[] args) {
            // Construct a binary tree
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right.left = new TreeNode(6);
            root.right.right = new TreeNode(7);

            TopViewBinaryTree topViewBT = new TopViewBinaryTree();
            List<Integer> topViewResult = topViewBT.topView(root);

            System.out.println("Top View of Binary Tree:");
            System.out.println(topViewResult);
        }
    }

}
