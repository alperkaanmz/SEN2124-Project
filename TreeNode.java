public class TreeNode {
    private int Value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int newElement) {
        //just for initialize the element
        Value = newElement;
        left = null;
        right = null;
    }
    public int getValue() {
        return Value;
    }
    public void setValue(int value) {
        Value = value;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
}