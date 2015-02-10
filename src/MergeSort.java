
public class MergeSort {

	static int inner=0;
	static int passnumber;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] number={5,8,9,1,2,0};
		
		int a=10;
		int  c=~0;
		int b=a^c;
		System.out.println(b);
		
	
				
		
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		/*MergeSort merge=new MergeSort();
		//merge.mergeSort(number);
		
		merge.quickSort(number, 0, number.length-1);
		
		
		for(int i=0;i<number.length;i++){
			System.out.println(number[i]);
		}*/
	}
	
	
	
	private void mergeSort(int [] a){
		
		int length=a.length;
		
		
		if(length<2){
			return;
		}
		int mid=length/2;
		
		
		//System.out.println(mid);
		
		int leftsize=mid;
		int rightsize=length-mid;
		
		
		
		
		
		int left[]=new int[leftsize];
		
		int right[]=new int[rightsize];
		
		for(int i=0;i<mid;i++){
			
			
			left[i]=a[i];
			right[i]=a[mid+i];
		}
		
		if(length%2!=0){
			
			
			right[rightsize-1]=a[length-1];
		}
		
		
		
		/*System.out.println("left array is ");
		for(int i=0;i<left.length;i++){
			
			System.out.print(left[i]);
			
		}
		
		System.out.println();
		
		System.out.println("right array is ");
		for(int i=0;i<right.length;i++){
			
			System.out.print(right[i]);
			
		}
		System.out.println();
		*/
		mergeSort(left);
		mergeSort(right);
		
		simpleMerge(left,right,a);
		
	}
	
	
	void simpleMerge(int left[],int right[],int a[]){
		
		int temp[]=new int[a.length];
		
		for(int i=0;i<temp.length;i++){
			
			temp[i]=a[i];
		}
		
		int i=0,j=0,k=0;
		
		while(i<=left.length-1 && j<=right.length-1){
			
			if(left[i]<right[j]){
				
				temp[k]=left[i];
			
				i=i+1;				
			}else
			{
				
				
				temp[k]=right[j];
				j=j+1;
				
			}
			
			k=k+1;
		}
		
		
		while(i<left.length){
			
			temp[k]=left[i];
			i=i+1;
			k=k+1;
		}
		
while(j<right.length){
			
			temp[k]=right[j];
			j=j+1;
			k=k+1;
		}
		
		/*if(i==left.length-1){
			
			for(int p=j;p<right.length;p++){
				
				
				temp[k]=right[p];
				k=k+1;
			}
			
			
		}else
		{
for(int p=i;p<left.length;p++){
				
				
				temp[k]=left[p];
				k=k+1;
			}
			
		}*/
		
		
		
		System.out.println("sortted array is ");
		
		for(int si=0;si<temp.length;si++){
			
			
			System.out.print(temp[si]);
		}
	}
	
	
	void quickSort(int a[],int left,int right){
		
		int i=left;
		int j=right;
		
		
		
		if(left<right){
		while(i<j){
			int x=a[left];
			while(i<right && a[i]<=x){
				i++;
			}
			
			while(j>0 && a[j]>x){
				j--;
			}
			
			if(j>i){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			
			
		}
		}else{
			return;
		}
		
		int temp2=a[j];
		a[j]=a[left];
		a[left]=temp2;
		quickSort(a,left,j-1);
		quickSort(a,j+1,right);
	
		
		
	}

}
