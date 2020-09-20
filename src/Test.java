import java.util.*;


class TreeNode {
    public TreeNode(int val) {
        this.val = val;
    }

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}


public class Test {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(4);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(11);
        head.left.right.left = new TreeNode(2);
        head.left.right.right = new TreeNode(7);
        head.right = new TreeNode(8);
        head.right.right = new TreeNode(9);

        System.out.println(hasSum(head, 22));
    }
    /**
     * @param root TreeNode类
     * @param sum  int整型
     * @return bool布尔型
     */
    public static boolean hasSum(TreeNode root, int target) {

        if(root == null) {
            return false;
        }
        target -= root.val;

        System.out.println(target);
        if (target == 0) {
            return true;
        }

        return hasSum(root.left,target) || hasSum(root.right,target);
    }
}
