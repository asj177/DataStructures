package crackTheCode;



import java.util.*;

public class CTCStack {
	
	ArrayList<Stack> stackArray=new ArrayList();
			int head=0;
    public static final int capacity=4;

    public void pushData(int data ){
    	
    	
    	if(head==0){
    		
    		Stack s=new Stack();
    		s.push(data);
    		stackArray.add(head, s);
    		head=head+1;
    		
    	}else{
    		Stack s=(Stack) stackArray.get(head-1);
    		if(s.size()==capacity){
    			System.out.println("new stack created ");
    			Stack newStack=new Stack();
    			newStack.push(data);
    			//head=head+1;
    			stackArray.add(head,newStack);
    			head=head+1;
    		}else{
    			
    			
    			stackArray.get(head-1).push(data);
    		}
    		
    		
    		
    		
    		
    	}
    }
    
    void pop(){
    	if(head>=0){
    	if(!stackArray.get(head-1).empty()){
    	System.out.println("data poped is "+stackArray.get(head-1).peek());
    	stackArray.get(head-1).pop();
    	}else{
    		head=head-1;
    		System.out.println("data poped is "+stackArray.get(head).peek());
        	stackArray.get(head).pop();
    		
    	}
    	}else{
    		
    		System.out.println("Stack underflow");
    	}
    	
    	
    }
    
    public int check(int i){
    	
    	if(i==-1){
    		return 0;
    	}
    	int height=check(i-1);
    	System.out.println(height);
    	return height;
    }
   
    
    public void convertToBinary(double number,String convertedNumber){
    	
    	
    	if(convertedNumber.length()>=31){
    		return;
    	}
    	//if(number==)
    	
    	
    	
    	
    	if(number*2>1){
    		
    		number=number*2-1;
    		
    		convertedNumber=convertedNumber+String.valueOf(1);
    		
    	}else{
    
    		number=number*2;
    		convertedNumber=convertedNumber+String.valueOf(0);
    	}
    	
    	
    	convertToBinary(number,convertedNumber);
    	System.out.println(convertedNumber);
    }
	/**
	 * @param args
	 */
    
    
    public void selectionSort(int a[]){
    	
    	int n=a.length;
    	
    	
    	for(int i=0;i<n-2;i++){
    		
    		int min=a[i];
    		int p=i;
    		
    		for(int j=i+1;j<n;j++){
    			
    			if(a[j]<min){
    				
    				min=a[j];
    				p=j;
    			}
    		}
    		
    		int temp=a[i];
    		a[i]=a[p];
    		a[p]=temp;
    		
    		
    	}
    	
    	for(int i=0;i<a.length;i++){
    		System.out.println(a[i]);
    	}
    }
    
    
    public void mergeSort(int array[]){
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTCStack main=new CTCStack();
		
		/*main.pushData(1);
		main.pushData(2);
		main.pushData(3);
		main.pushData(4);
		main.pushData(5);
		main.pushData(11);
		main.pushData(12);
		main.pushData(13);
		main.pushData(14);
		main.pushData(15);
		main.pushData(21);
		main.pushData(22);
		main.pushData(23);
		
		main.pop();
		main.pop();*/
		
		//Stack s1=new Stack();
		//Stack s2=new Stack();
		int []a={9,2,1,6,3,4,10};
		main.selectionSort(a);
		//main.convertToBinary(0.72, "");
		/*double number=0.86*2;
		
		if(number>1){
			System.out.println(number-1);
			System.out.println((int)number/10);
		}else{
			System.out.println(number);
			System.out.println((int)number/10);
		}*/
		
		
		
		/*System.out.println(main.check(10));
		int i=~0;
		System.out.println(Integer.toBinaryString(i).length());
		System.out.println(Integer.toBinaryString((1<<2)-1));
		
		int left=i<<(4);
		System.out.println(Integer.toBinaryString(left));*/
		
		
		
		
		

	}

}
