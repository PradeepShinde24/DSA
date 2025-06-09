package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Postfix
{

    // Method to define precedence of operators
    static int precedence(char c)
    {
        if (c == '+' || c == '-')
        	return 1;
        else if (c == '*' || c == '/') 
        	return 2;
        else if (c == '^') 
        	return 3;
        else return 0;
    }

    // Method to convert infix to postfix
    static String convert(String in)
    {
        String post = "";
        Stack<Character> s = new Stack<>();

        for (char c : in.toCharArray())
        {
            if (c == '(')
            {
                s.push(c);
            } 
            
            // Handling ')' (Right Parenthesis)
            else if (c == ')')
            {
                while (!s.isEmpty() && s.peek() != '(')
                {
                    post += s.pop();
                }
                if (!s.isEmpty() && s.peek() == '(')
                {
                    s.pop(); // Remove '('
                }
            } 
            
            // Handling Operators
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') 
            {
                while (!s.isEmpty() && precedence(s.peek()) >= precedence(c))
                {
                    post += s.pop();
                }
                s.push(c);
            } 
            else
            {
                // Operand go directly to string output
                post += c;
            }
        }

        // Pop any remaining operators in the stack
        while (!s.isEmpty()) {
            post += s.pop();
        }

        return post;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String infix = sc.next();
        String postfix = Infix_To_Postfix.convert(infix);
        System.out.println("Postfix is: " + postfix);
        sc.close();
    }
}
