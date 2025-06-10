package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue (add) operation
    void enqueue(int data) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into s1
        s1.push(data);

        // Push everything back to s1 from s2
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue (remove) operation
    int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }

    // Peek (front element) operation
    int peek() {
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.peek();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return s1.isEmpty();
    }

    // Main method (Menu-Driven)
    public static void main(String[] args) {
        ImplementQueueUsingStack q = new ImplementQueueUsingStack();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. isEmpty\n5. Exit");

        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    int removed = q.dequeue();
                    if (removed != -1) {
                        System.out.println("Dequeued element: " + removed);
                    }
                    break;

                case 3:
                    int front = q.peek();
                    if (front != -1) {
                        System.out.println("Front element: " + front);
                    }
                    break;

                case 4:
                    System.out.println("Is queue empty? " + q.isEmpty());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
