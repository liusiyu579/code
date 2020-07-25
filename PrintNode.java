import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintNode {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(pRoot == null){
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(pRoot);
        boolean flg = false;
        while (!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if(node == null){
                    continue;
                }
                if(!flg) {
                    list.add(node.val);
                }else {
                    list.add(0,node.val);
                }
                q.offer(node.left);
                q.offer(node.right);
            }
            if(list.size() > 0)
                ret.add(list);
            flg = !flg;
        }
        return ret;
    }
}
