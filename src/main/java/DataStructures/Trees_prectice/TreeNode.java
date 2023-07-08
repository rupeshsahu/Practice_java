package DataStructures.Trees_prectice;

public class TreeNode {
    int value;
    TreeNode leftnode;
    TreeNode rightnode;

    public TreeNode(int value, TreeNode leftnode, TreeNode rightnode) {
        this.value = value;
        this.leftnode = leftnode;
        this.rightnode = rightnode;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeftnode() {
        return leftnode;
    }

    public TreeNode getRightnode() {
        return rightnode;
    }
}
