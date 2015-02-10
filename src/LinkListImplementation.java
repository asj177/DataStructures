import java.util.HashMap;


public class LinkListImplementation {

	
	
	LinkListNode head;
	LinkListNode track;
	
	
	int data;
	
	public void add(int data){
		
		LinkListNode newRecord=new LinkListNode(data);
		
		
		if(head==null){
			head=newRecord;
			 track=head;
		}
		
		else{
			
				
			
			track.next=newRecord;
			track=newRecord;
			
			
			
			
		}
	}
	
	public void makeCircular(LinkListNode tail){
		
		tail.next=head.next.next.next;
	}
	
	public void addition(LinkListNode head1,LinkListNode head2){
		
		LinkListImplementation result=new LinkListImplementation();
		
		LinkListNode count1=head1;
		
		LinkListNode count2=head2;
		
		while(count1!=null && count2!=null){
			
			int add=count1.data+count2.data;
			
			if(add>10){
				
				count1.next.data=+1;
				add=add%10;
				
				
			}
			result.add(add);
			
			count1=count1.next;
			count2=count2.next;
		}
		
		result.display(result.head);
	}
	
	public void display(LinkListNode head){
		
		LinkListNode display=head;
		HashMap map=new HashMap();
		
		while(display!=null){
			System.out.println(display.data);
			
			if(!map.containsKey(display.data)){
			
			map.put(display.data, display.data);
			display=display.next;
			
			}else{
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkListImplementation count1=new LinkListImplementation();
		
		count1.add(4);
		count1.add(7);
		
		count1.add(1);
		count1.add(2);
		count1.add(9);
		count1.add(8);
		count1.add(7);
		
		
		count1.makeCircular(count1.track);
		
		count1.display(count1.head);
		
		/*LinkListImplementation count2=new LinkListImplementation();
		
		count2.add(3);
		count2.add(6);
		count2.add(4);
		count2.add(7);
		
		LinkListImplementation resultdata=new LinkListImplementation();
		
		resultdata.addition(count1.head, count2.head);*/
		
		

	}

}
