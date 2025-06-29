package DSA_Stack;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ImplementStackUsingQueue  // Dynamic 
{
	Queue<Integer> q = new LinkedList<>();
	
	void push(int num)
	{
		q.add(num);
		int size = q.size();
		for(int i =0; i<size-1; i++)
		{
			q.add(q.remove());
		}
	}
	
	int pop()
	{
		if(q.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return q.remove();
	}
	
	int top()
	{
		if(q.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return q.peek();
	}
	
	boolean isEmpty()
	{
		return q.isEmpty();
	}

	// Print all elements of the queue
    void printStack()
    {
        if (q.isEmpty())
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Stack elements (top to bottom):");
            for (int i = 0; i<q.size(); i++)
            {
                System.out.println(((LinkedList<Integer>) q).get(i));
            }
            System.out.println();
        }

		// // other method to achieve same 
		// else
    	// {
        // 	// Cast Queue to LinkedList to access get(i)
        // 	LinkedList<Integer> list = (LinkedList<Integer>) q;

        // 	System.out.println("Stack elements (top to bottom):");
        // 	for (int i = 0; i < list.size(); i++)
        // 	{
        // 	    System.out.print(list.get(i) + " ");
        // 	}
        // 	System.out.println();
    	// }
    }
	
	public static void main(String [] args)
	{
		ImplementStackUsingQueue st = new ImplementStackUsingQueue();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("1. Push\n2. Pop\n3.Top\n4. isEmpty\n5. printStack\n6. Exit");
		
		do
		{
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
                    System.out.print("Enter element to push: ");
                    int val = sc.nextInt();
                    
                    st.push(val);
                    break;

				case 2:
					int popped = st.pop();
					
                    if(popped != -1)
                    {
                    	
                        System.out.print("Popped Element: "+popped);
                    }
                    break;

				case 3:
					int top = st.top();
                    
					if(top != -1)
					{

	                    System.out.print("Top element: "+top);
					}
                    break;

				case 4:
                    System.out.print("is Stack is Empty? "+st.isEmpty());
                    break;

				case 5:
					st.printStack();
                    break;
                 
				case 6:
                    System.out.print("Existing... ");
                    break;

               default:
                   System.out.print("Invalid Choice");
			}
		}
		while(choice != 5);
		
		sc.close();
	}
}
