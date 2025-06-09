package DSA_Stack;

import java.util.Scanner;
import java.util.Stack;


//Stack Type:- ✅ Custom stack using char[] array
//Stack Operations:- Manually written (push, pop, isEmpty, etc.)

public class ReverseStringUsingStack
{
	int MaxSize,tos;
    char stack[];
    //create_Stack:creates stack,init tos -1 and prepare stack for use
    void create_Stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new char[MaxSize];
    }
    //push(e):will insert element on top of stack
    //            tos+1
    void push(char e)
    {
        tos++;//1
        stack[tos]=e;//pushed---stack[++tos]=e
    }
    //isFull():returns true if full else false
    boolean isFull()
    {
        if(tos==MaxSize-1)//as array
            return true;
        else
            return false;
    }
    //pop():e remove and return element from tos,tos-1
    char pop()
    {
        char temp=stack[tos];//1
        tos--;//2
        return(temp);//3
    }
    boolean isEmpty()
    {
        if(tos==-1)//as array
            return true;
        else
            return false;
    }
    
    //print_stack():prints data in LIFO manner,tos to 0
    void print_Stack()
    {
        for(int i=tos;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter String:");// read a str from user
        String str=in.nextLine();
        
        //let stack be size of String length itself
        ReverseStringUsingStack obj=new ReverseStringUsingStack();
        obj.create_Stack(str.length());
        
        //use loop to read char by char element from 0th to end
        for(int i=0;i<str.length();i++)// and push in stack
        {
            obj.push(str.charAt(i));
        }
        
        //reverse String
        String rstr="";
        while(obj.isEmpty()!=true)
        {
            rstr=rstr+obj.pop(); //when all on stack print--pop (string +)
        }
        System.out.println("Reverse String:"+rstr);

    }
}
