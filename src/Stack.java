import java.util.ArrayList;
import java.util.List;

import java.util.*;


public class Stack {

	
	StackNode last;
	//ArrayList stackList=new ArrayList();
	int headStack=0;
	//public static final int capacity=5;
	
	int min;
	
	void push(int data){
		
		StackNode newRecord=new StackNode(data);
		
		if(last==null){
			
			last=newRecord;
			min=newRecord.data;
		}else{
			if(min>newRecord.data){
				min=newRecord.data;
			}
			newRecord.next=last;
			last=newRecord;
		}
		
		
	}
	

	
	int getMin(){
		return min;
	}
	
	void pop(){
		
		if(last==null){
			
			System.out.println("Stack Undeflow");
			
		}else{
		System.out.println("data poped is "+last.data);
		last=last.next;
		}
	}
	
	void display(StackNode last){
		
		while(last!=null){
			
			System.out.println(last.data);
			last=last.next;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack=new Stack();
		
		stack.push(4);
		stack.push(9);
		stack.push(7);
		stack.push(6);
		
		System.out.println("Minimum data is "+stack.getMin());

	}

}
