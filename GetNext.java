class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null){
            return pNode;
        }
        if(pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next!= null){
            TreeLinkNode node = pNode.next;
            if (node.left == pNode){
                return node;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
