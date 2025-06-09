package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Class
{
    int tos, MaxSize, s[];

    Stack_Class(int size) {
        tos = -1;
        MaxSize = size;
        s = new int[size];
    }

    void push(int e) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + e);
        } else {
            s[++tos] = e;
            System.out.println(e + " pushed to stack.");
        }
    }

    boolean isFull() {
        return (tos == MaxSize - 1);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return s[tos--];
        }
    }

    boolean isEmpty() {
        return (tos == -1);
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents (top to bottom):");
            for (int i = tos; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}