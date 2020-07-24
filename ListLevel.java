import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListLevel {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null){
            return ret;
        }
        q.offer(pRoot);
        while (!q.isEmpty()){
            ArrayList<Integer> a = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                a.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            ret.add(a);
        }
        return ret;
    }
}
