package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;


// Only () bracket handles

public class ParenthesesChecker
{

    public static boolean isWellFormed(String expr)
    {
        Stack<Character> s = new Stack<>();

        for (char c : expr.toCharArray())
        {
        	if(c == '{')
        		s.push(c);
        	if(c == '}')
        		if(!s.empty())
        			s.pop();
        		else
        			return false;
        }

        // If stack is not empty, some opening brackets are unmatched
        return s.empty();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String expr = sc.nextLine();
        

        System.out.println("Pattern: " +ParenthesesChecker.isWellFormed(expr));

    }
}




