package adt.nodes;

import adt.tree.BinaryTree;

public class NodeOfBT {

    private BinaryTree value;
    private NodeOfBT next;

    public NodeOfBT(BinaryTree value, NodeOfBT next) {
        this.value = value;
        this.next = next;
    }

    public BinaryTree getValue() {
        return value;
    }

    public void setValue(BinaryTree value) {
        this.value = value;
    }

    public NodeOfBT getNext() {
        return next;
    }

    public void setNext(NodeOfBT next) {
        this.next = next;
    }
}
