package com.sist.collection;
/*
 *   Stack : LIFO  => �޸� ==> �޸𸮸�(Stack) , �޼ҵ� ȣ�� (Call Stack)
 *     int a=10;==3
 *     {
 *        int b=20;==2
 *        {
 *           int c=30; ==1
 *        }
 *     }
 *    Queue : FIFO => �ü�� 
 *                    �޸��� / �׸��� / ������ 
 *                    ��Ʈ��ũ Hello Java   ==> avaJ olleH
 *    Stack : ���� / ���
 *            push  pop
 *    Queue : ���� / ��� 
 *            opper poll
 *            ==> !empty()
 */
import java.util.*;
public class MainClass_Stack_Queue {
	private int s_index;
    private int e_index;
    private int[] arr=new int[10];
    public MainClass_Stack_Queue()
    {
    	s_index=0;
    	e_index=arr.length-1;
    }
    public void push(int a)
    {
    	arr[s_index]=a;
    	s_index++;
    }
    public void pop()
    {
    	for(int i=e_index;i>=0;i--)
    	{
    		
    	   System.out.println(arr[i]);
    		
    	}
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MainClass_Stack_Queue sq=new MainClass_Stack_Queue();
	        sq.push(1);
	        sq.pop();
	        System.out.println("=====");
	        sq.push(2);
	        sq.pop();
	        sq.push(3);
	        sq.pop();
	}

}
