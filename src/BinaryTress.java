
public class BinaryTress {

	Node left;
	
	Node right;
	
	Node root;
	
	public void insert(int data){
		
		Node treedata=new Node(data);
		treedata.left=null;
		treedata.right=null;
		
		if(root==null){
			root=treedata;
			
		}else{
			left=right=root;
			
				
				while(left!=null){
					right=left;
					if(left.data>treedata.data){
						
						left=left.left;
					}else{
						left=left.right;
					}
				}
				
				if(right.data>treedata.data){
					
					right.left=treedata;
				}else{
					
					right.right=treedata;
				}
			
			
		}
		
		
	
		
	}
	
	public void inorder(Node inorder){
		
		if(inorder!=null){
			
			inorder(inorder.left);
			System.out.println(inorder.data);
			inorder(inorder.right);			
		}
		
	}
	
	public  int maxDepth(Node node){
		if(node==null){
			
			return 0;
		}else{
			
			int ldepth=maxDepth(node.left);
			int rdepth=maxDepth(node.right);
			if(ldepth>rdepth){
				
				return(ldepth+1);
			}else{
				return (rdepth+1);
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTress binarytree=new BinaryTress();
		
		binarytree.insert(100);
		binarytree.insert(50);
		binarytree.insert(200);
		binarytree.insert(75);
		binarytree.insert(25);
		binarytree.insert(300);
		binarytree.insert(175);
		binarytree.insert(89);
	
		//binarytree.inorder(binarytree.root);
		System.out.println("Max depth is "+binarytree.maxDepth(binarytree.root));
		

	}

}
