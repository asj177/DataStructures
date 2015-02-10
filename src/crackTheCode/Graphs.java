package crackTheCode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Graphs {
	
	int []visited={0,0,0,0,0};
	
	LinkedList<Integer>path=new LinkedList<Integer>();
	
	
	
	public boolean checkPath(int [][]checkPath,int source,int destination){
		
		
		boolean destinationReached=false;
		
		Queue<Integer> q=new LinkedList <Integer> ();
		
		q.add(source);
		
		while(!q.isEmpty()){
			
			int node=q.remove();
			visited[node]=1;
			path.add(node);
			if(node==destination){
				destinationReached=true;
				break;
			}
			
			for(int i=0;i<checkPath.length;i++){
				if(checkPath[node][i]==1 && visited[i]!=1){
					
					q.add(i);
				}
				
				
			}
			
			
		}
		
		return destinationReached;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]graph=new int [5][5];
		
		graph[0][0]=1;
		graph[0][1]=1;
		graph[0][2]=0;
		graph[0][3]=1;
		graph[0][4]=0;
		
		graph[1][0]=0;
		graph[1][1]=1;
		graph[1][2]=0;
		graph[1][3]=0;
		graph[1][4]=0;
		
		graph[2][0]=0;
		graph[2][1]=1;
		graph[2][2]=1;
		graph[2][3]=0;
		graph[2][4]=1;
		
		graph[3][0]=0;
		graph[3][1]=0;
		graph[3][2]=0;
		graph[3][3]=1;
		graph[3][4]=1;
		
		graph[4][0]=0;
		graph[4][1]=0;
		graph[4][2]=0;
		graph[4][3]=0;
		graph[4][4]=0;
		
		
		Graphs graphs=new Graphs();
		
		if(graphs.checkPath(graph, 0, 4)){
			
			System.out.println("Path exists");
			
			System.out.println("path is ");
			ListIterator i=graphs.path.listIterator();
			
			while(i.hasNext()){
				
				System.out.println(i.next());
			}
			
		}else{
			
			System.out.println("Path does not exists");
		}
		
		

	}

}
