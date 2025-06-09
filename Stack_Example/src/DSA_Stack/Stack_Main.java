package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;


public class Stack_Main
{
  // main method
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of the stack: ");
      int size = sc.nextInt();
      Stack_Class st = new Stack_Class(size);

      int choice;
      do {
          System.out.println("\n--- Stack Menu ---");
          System.out.println("1. Push");
          System.out.println("2. Pop");
          System.out.println("3. Print Stack");
          System.out.println("4. Check if Empty");
          System.out.println("5. Check if Full");
          System.out.println("6. Exit");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt();

          switch (choice) {
              case 1:
                  System.out.print("Enter element to push: ");
                  int val = sc.nextInt();
                  st.push(val);
                  break;
              case 2:
                  int popped = st.pop();
                  if (popped != -1)
                      System.out.println("Popped: " + popped);
                  break;
              case 3:
                  st.printStack();
                  break;
              case 4:
                  System.out.println("Is stack empty? " + st.isEmpty());
                  break;
              case 5:
                  System.out.println("Is stack full? " + st.isFull());
                  break;
              case 6:
                  System.out.println("Exiting...");
                  break;
              default:
                  System.out.println("Invalid choice! Try again.");
          }

      } while (choice != 6);

      sc.close();
  }
}