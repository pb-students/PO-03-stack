package net.wvffle.objectProgramming.lesson03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; ++i) {
            stack1.push(scanner.nextInt());
        }

        scanner.close();

        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.empty()) {
            int item = stack1.pop();

            stack2.push(item);
            System.out.println(item);
        }

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }
}
