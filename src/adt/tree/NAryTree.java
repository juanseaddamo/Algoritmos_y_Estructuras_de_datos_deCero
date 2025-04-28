package adt.tree;

public interface NAryTree {

    int getRoot();

    void add(int value, int index);

    NAryTree get(int index);

    void delete(int index);

}
