import java.util.Stack;

public class BinaryTree {
    public TreeNode root;
    public int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    private TreeNode createNewNode(int e) {
        return new TreeNode(e);
    }

    public boolean insert(int e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode parent = null;
            TreeNode current = root;
            while (current != null) {
                if (e < current.getValue()) {
                    parent = current;
                    current = current.getLeft();
                } else if (e > current.getValue()) {
                    parent = current;
                    current = current.getRight();
                } else
                    return false;
            }
            if (e < parent.getValue()) {
                parent.setLeft(createNewNode(e));
            } else {
                parent.setRight(createNewNode(e));
            }
        }
        size++;
        return true;
    }


    public void inOrderWithoutRecursion() {
        Stack nodes = new Stack<>();
        TreeNode current = root;
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current);
                current = current.getLeft();
            } else {
                TreeNode node = (TreeNode) nodes.pop();
                System.out.printf("%s ", node.getValue());
                current = node.getRight();
            }
        }
    }
}