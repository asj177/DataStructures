package crackTheCode;

import java.util.Stack;

public class MyQueue {

	
	Stack s1=new Stack();
	
	Stack s2=new Stack();
	
	void add(int data ){
		
		s1.push(data);
	}
	
	void remove(){
		
		while(!s1.empty()){
			
			s2.push(s1.pop());
		}
		
		System.out.println("data poped is "+s2.pop());
		
		while(!s2.empty()){
			
			s1.push(s2.pop());
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue queue=new MyQueue();
		
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		queue.add(0);
		
		queue.remove();
		queue.remove();
		queue.remove();
		

	}

}
