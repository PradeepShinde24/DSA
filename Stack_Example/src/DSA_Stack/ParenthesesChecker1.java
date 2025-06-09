package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker1
{
    // Static method to check if parentheses are well-formed
    public static boolean isWellFormed(String expr)
    {
        Stack<Character> s = new Stack<>();
        
        /*
         .toCharArray():- converts a String into an array of characters (char[])
        	String expr = "({[]})";
        	char[] arr = expr.toCharArray(); 
        	// arr = ['(', '{', '[', ']', '}', ')']
        
        This is equivalent to writing a traditional for loop like
        	char[] chars = expr.toCharArray();
			for (int i = 0; i < chars.length; i++)
			{
    			char ch = chars[i];
    			// do something with ch
			}
      */
        for (char ch : expr.toCharArray())   
        {
            // If opening bracket, push to s
            if (ch == '(' || ch == '{' || ch == '[')
            {
                s.push(ch);
            }

            // If closing bracket, check for match
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (s.isEmpty())
                {
                    return false; // No matching opening bracket
                }

                char top = s.pop();

                if ( (ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') )
                {
                    return false; // Mismatch
                }
            }
        }

        // If s is not empty, some opening brackets are unmatched
        return s.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input expression
        System.out.print("Enter an expression with parentheses: ");
        String expr = sc.nextLine();


        System.out.println("Pattern: " +ParenthesesChecker1.isWellFormed(expr));

        sc.close();
    }
}
