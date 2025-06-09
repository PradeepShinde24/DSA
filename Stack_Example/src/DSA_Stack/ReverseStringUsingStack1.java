package DSA_Stack;

import java.util.Stack;
import java.util.Scanner;

//Stack Type:- ✅ Java built-in Stack<Character>
// Stack Operations:- Uses Java's library methods (push, pop, empty())

public class ReverseStringUsingStack1
{
	static String reverse(String word)
    {
        String rword="";
        Stack<Character> s=new Stack<>();
        
        for(char c:word.toCharArray()) //push
            s.push(c);
        
        while (!s.empty()) //pop()
            rword+=s.pop();

        return rword;
    }
	
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter word:");
        String word=sc.next();
        
        String rword=ReverseStringUsingStack1.reverse(word);
        System.out.println("Reverse word:"+rword);
    }
}
