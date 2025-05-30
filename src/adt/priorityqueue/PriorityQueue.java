package adt.priorityqueue;

public interface PriorityQueue {

    int getFirst();

    int getPriority();

    void remove();

    void add(int value, int priority);

    boolean isEmpty();

}
