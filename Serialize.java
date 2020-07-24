
public class Serialize {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    String serialize(TreeNode root) {
        if(root == null){
            return "#";
        }else {
            return root.val + "," + serialize(root.left) + "," + serialize(root.right);
        }
    }
    int index = -1;
    TreeNode deserialize(String str) {
        String[] s = str.split(",");
        index++;
        int len = s.length;
        if(index > len){
            return null;
        }
        TreeNode node = null;
        if(!s[index].equals("#")){
            node = new TreeNode(Integer.parseInt(s[index]));
            node.left = deserialize(str);
            node.right = deserialize(str);
        }
        return node;
    }
}
