package net.wvffle.objectProgramming.lesson03;

public interface StackInterface<T> {
    // Like for real? Is this even needed?
    public Stack init ();
    public void destroy ();

    public boolean push(T item);
    public T pop();

    // Not in spec but may be useful
    public int size ();

    public boolean empty ();
    public boolean full ();
}
