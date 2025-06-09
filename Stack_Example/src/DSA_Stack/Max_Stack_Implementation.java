package DSA_Stack;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Max_Stack_Implementation
//{
//	static Stack<Integer> N_stack = new Stack<>();
//	static Stack<Integer> Max_stack = new Stack<>();
//	
//
//	// if not empty push to both if new>max_stack.peek()
//	// function push accept number, if empty push to both
//	// else only to normal_stack
//	
//    static void push(int e)
//    {
//    	
//        if (N_stack.empty() && Max_stack.empty() || (e>Max_stack.peek()))
//        {
//        	N_stack.push(e);
//            Max_stack.push(e);
//        }
//        else
//        {
//        	N_stack.push(e);
//        }
//    }
//    
//    // pop from both if .peek of both equals else only from normal stack
//    static int pop()
//    {
//    	if(!N_stack.empty() && (N_stack.peek() == Max_stack.peek()))
//    	{
//    		N_stack.pop();
//    		
//    		return (Max_stack.pop());
//         }
//         else if (!N_stack.empty() && (N_stack.peek() != Max_stack.peek()))
//         {
//           	return (N_stack.pop());
//         }
//    	 
//    	  return -1;
//    }
//    
//    static int get_Max()
//    {
//    	
//    	return (Max_stack.peek());
//    }
//    
//    static void print_stack()
//    {
////    	N_stack
//    }
//    
//    static int peek()
//    {
//    	if(!N_stack.empty())
//    	{
//    		return (N_stack.peek());
//    		
//         }
//    	  return -1;
//    }
//
//	
//	public static void main(String args[])
//	{
//		Max_Stack_Implementation.push(10);
//		Max_Stack_Implementation.push(20);
//		Max_Stack_Implementation.push(1);
//		Max_Stack_Implementation.push(24);
//		Max_Stack_Implementation.push(7);
//		
//		System.out.println("Peek: "+Max_Stack_Implementation.peek());
//		System.out.println("Pop: "+Max_Stack_Implementation.pop());
//		System.out.println("Get Max: "+Max_Stack_Implementation.get_Max());
//		System.out.println("Peek: "+Max_Stack_Implementation.peek());
//		System.out.println("Pop: "+Max_Stack_Implementation.pop());
//		System.out.println("Get Max: "+Max_Stack_Implementation.get_Max());
//		System.out.println("Peek: "+Max_Stack_Implementation.peek());
//		
//	}
//}


import java.util.Stack;

class Max_Stack_Implementation
{
	static Stack<Integer> N_s = new Stack<>();
	static Stack<Integer> Max_s = new Stack<>();
	
	
	static void push(int e)
	{
		if(N_s.empty() && Max_s.empty() || (e > Max_s.peek()))
		{
			N_s.push(e);
			Max_s.push(e);
		}
		else
		{
			N_s.push(e);
		}
	}
	
	static int pop()
	{
		if(!N_s.empty() && (N_s.peek() == Max_s.peek()))
		{
			N_s.pop();
			return (Max_s.pop());
		}
		if(!N_s.empty() && (N_s.peek() != Max_s.peek()))
		{
			return(N_s.pop());
		}
		return -1;
	}
	
	static int get_Max()
	{
		return(Max_s.peek());
	}
	
	static int peek()
	{
		if(!N_s.empty())
		{
			return (N_s.peek());
		}
		return -1;
	}
	
	static void print_Stack()
	{
		if(N_s.empty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Current Stack(top to bottom): ");
			for(int i = N_s.size()-1; i>=0; i--)
			{
				System.out.println(N_s.get(i));
			}		
		}
	}
	
	public static void main(String [] args)
	{
		Max_Stack_Implementation.push(10);
		Max_Stack_Implementation.push(20);
		Max_Stack_Implementation.push(1);
		Max_Stack_Implementation.push(24);
		Max_Stack_Implementation.push(7);
		

		Max_Stack_Implementation.print_Stack();
		

		System.out.println("Peek: "+Max_Stack_Implementation.peek());
		System.out.println("Pop: "+Max_Stack_Implementation.pop());
		System.out.println("Get Max: "+Max_Stack_Implementation.get_Max());
		Max_Stack_Implementation.print_Stack();
		System.out.println("Peek: "+Max_Stack_Implementation.peek());
		System.out.println("Pop: "+Max_Stack_Implementation.pop());
		System.out.println("Get Max: "+Max_Stack_Implementation.get_Max());
		Max_Stack_Implementation.print_Stack();
		System.out.println("Peek: "+Max_Stack_Implementation.peek());
			
	}
	
	
	
	
	
	
}