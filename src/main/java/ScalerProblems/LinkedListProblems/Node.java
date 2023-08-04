package ScalerProblems.LinkedListProblems;

public class Node {
    int value;
    Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
