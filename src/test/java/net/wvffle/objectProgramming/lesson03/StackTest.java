package net.wvffle.objectProgramming.lesson03;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void pushPop() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(2);

        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void empty() {
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.empty());

        stack.push(1);
        assertFalse(stack.empty());

        stack.pop();
        assertTrue(stack.empty());
    }
}
