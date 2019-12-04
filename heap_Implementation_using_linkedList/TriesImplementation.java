package heap.heap_Implementation_using_linkedList;

public class TriesImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriesNode root=insert("sopan",null);
		insert("sopanraj", root);
		insert("yuvraj", root);	
		insert("yuvra", root);	
		System.out.println(search("sopan",root));
		System.out.println(search("sopanr",root));
		System.out.println(search("yuvraj",root));
		System.out.println(search("yuvra",root));
		delete("yuvra",root);
		delete("sopan",root);
		delete("sopanraj",root);
		delete("yuvraj",root);
		insert("raj", root);
		System.out.println(search("sopan",root));
		System.out.println(search("sopanr",root));
		System.out.println(search("yuvraj",root));
		System.out.println(search("yuvra",root));
		System.out.println(search("raj",root));
	}
	
	public static TriesNode insert(String key,TriesNode root){		 
		if(root==null){
			//Create root node with children alphabet size=26	
		root=new TriesNode();
		}
		TriesNode temp=root;
		//Add every char form String and return root
		for(int i=0;i<key.length();i++){
			boolean found=false;
			TriesNode match=null;
			if(null!=temp){
			for(TriesNode child: temp.childrens){
				if(child.data==key.charAt(i)){
					found=true;
					match=child;
				}
			}
			}
			if(!found){
				TriesNode t=new TriesNode();
				t.data=key.charAt(i);
				temp.childrens.add(t);
				temp=t;
			}else{
				temp=match;
				found=false;
			}		
			
		}		
			temp.isEndOfString=true;
		
		return root;
	}
	
	public static boolean search(String key, TriesNode root){
		
		TriesNode temp=root;
		TriesNode match=null;
		for(int i=0;i<key.length();i++){			
			boolean found=false;
			if(null!=temp){
				for(TriesNode child: temp.childrens){
					if(child.data==key.charAt(i)){
						found=true;
						match=child;
					}
				}
			}
			
			if(!found){
				return false;
			}else{
				found=false;
				temp=match;				
			}
		}
		if(temp.isEndOfString==true)
			return true;		
		return false;
	}
	
	public static boolean delete(String key, TriesNode root){
		
		TriesNode temp=root;
		TriesNode match=null;
		for(int i=0;i<key.length();i++){
			boolean found=false;
			if(null!=temp){
				for(TriesNode child: temp.childrens){
					if(child.data==key.charAt(i)){
						found=true;
						match=child;
					}
				}
			}
			
			if(!found){
				return false;
			}else{
				found=false;
				temp=match;				
			}
			
			
		}
		
		if(temp.isEndOfString==true){
			temp.isEndOfString=false;
			return true;
		}		
		return false;
	}

}
