import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class KthNode {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null || k < 0){
            return null;
        }
        inOrder(pRoot);
        if (k-1 >= 0 && list.size() >= k){
            return list.get(k-1);
        }
        return null;
    }
    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            list.add(root);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {

    }
}
