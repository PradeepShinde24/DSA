package DSA_Stack;

import java.util.Stack;
import java.util.Scanner;

public class Prefix_Evaluation
{

    static int evaluate(String prefix)
    {
        Stack<Integer> s = new Stack<>();

        // Traverse the expression from **right to left**
        for (int i = prefix.length() - 1; i >= 0; i--)
        {
            char c = prefix.charAt(i);

            if (Character.isDigit(c))
            {
                s.push(c - '0'); // Convert char digit to int
            }
            else
            {
            	int op1, op2;
                // Operator encountered: pop two operands
                op1 = s.pop();
                op2 = s.pop();

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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prefix Expression: ");
        String prefix = sc.next();

        int result = Prefix_Evaluation.evaluate(prefix);
        System.out.println("Evaluated answer is: " + result);

        sc.close();
    }
}
