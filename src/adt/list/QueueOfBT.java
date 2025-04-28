package adt.list;

import adt.tree.BinaryTree;

public interface QueueOfBT {

    BinaryTree getFirst();

    void remove();

    void add(BinaryTree value);

    boolean isEmpty();

}
