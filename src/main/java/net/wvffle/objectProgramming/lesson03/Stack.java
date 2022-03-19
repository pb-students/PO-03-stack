package net.wvffle.objectProgramming.lesson03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Stack<T> implements StackInterface<T> {
    private List<T> array;

    public Stack () {
        this.array = new ArrayList<>();
    }

    public Stack (List<T> array) {
        this.array = array;
    }

    @Override
    public Stack<T> init() {
        return this;
    }

    @Override
    public void destroy() {

    }

    @Override
    public boolean push(T item) {
        if (item == null) {
            return false;
        }

        array.add(item);
        return true;
    }

    @Override
    public T pop() {
        int idx = size() - 1;
        if (idx == -1) {
            return null;
        }

        T item = array.get(idx);
        array.remove(idx);

        return item;
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public boolean full() {
        return false;
    }
}
