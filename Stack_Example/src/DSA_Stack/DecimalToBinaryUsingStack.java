package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryUsingStack
{

    // Method to convert decimal to binary using stack
    public static void convertToBinary(int decimal)
    {
        if (decimal == 0)
        {
            System.out.println("Binary: 0");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        while (decimal > 0)
        {
            int digit = decimal % 2;
            stack.push(digit);
            decimal /= 2;
        }

        System.out.print("Binary: ");
        while (!stack.isEmpty()) 
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        
        convertToBinary(dec);
        
        sc.close();
    }
}
