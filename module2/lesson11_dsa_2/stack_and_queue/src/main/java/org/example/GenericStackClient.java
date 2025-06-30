package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/22
 * Time: 11:51
 */
public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        System.out.println("String stack size: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("String stack size after popping: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Integer stack size: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Integer stack size after popping: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of Strings:");
        stackOfStrings();
        System.out.println("\nStack of Integers:");
        stackOfIntegers();
    }
}
