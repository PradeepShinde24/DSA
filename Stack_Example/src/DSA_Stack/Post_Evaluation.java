package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

/*
	The code evaluates(solved) a Postfix Expression (also known as Reverse Polish Notation) 
	and return the value using a stack.
	example: A postfix string like "23+5*"
	         An integer result of the evaluation: 25
*/

public class Post_Evaluation
{

    static int evaluate(String postfix)
    {
        Stack<Integer> s = new Stack<>(); // Stack for operands

        // Traverse character by character
        for (char c : postfix.toCharArray())
        {
            if (Character.isDigit(c))
            {
                // Convert char digit to integer and push
                s.push(c - '0');
            } 
            else
            {
                // Operator encountered: pop two operands
                int op2 = s.pop(); // 1st pop
                int op1 = s.pop(); // 2nd pop

                // Apply operator
                switch (c)
                {
                    case '+':
                        s.push(op1 + op2);
                        break;
                    case '-':
                        s.push(op1 - op2);
                        break;
                    case '*':
                        s.push(op1 * op2);
                        break;
                    case '/':
                        s.push(op1 / op2);
                        break;
                    case '%':
                        s.push(op1 % op2);
                        break;
                }
            }
        }

        return s.pop(); // Final result
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression: ");
        String postfix = sc.next();

        int answer = Post_Evaluation.evaluate(postfix);
        System.out.println("Evaluated answer is: " + answer);

        sc.close();
    }
}
