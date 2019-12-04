package heap.tries_Implementation;

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
		root=new TriesNode(26);
		}
		TriesNode temp=root;
		//Add every char form String and return root
		for(int i=0;i<key.length();i++){
			TriesNode t=new TriesNode(26);
			t.data=key.charAt(i);			
			int index=key.charAt(i)-'a';
			if(temp.children[index]==null){
			temp.children[index]= t;
			}
			temp=temp.children[index];
		}		
			temp.isEndOfString=true;
		
		return root;
	}
	
	public static boolean search(String key, TriesNode root){
		
		TriesNode temp=root;
		
		for(int i=0;i<key.length();i++){			
			int index=key.charAt(i)-'a';
			if(temp.children[index]==null){
				return false;
			}
			
			temp=temp.children[index];
		}
		if(temp.isEndOfString==true)
			return true;		
		return false;
	}
	
	public static boolean delete(String key, TriesNode root){
		
		TriesNode temp=root;
		for(int i=0;i<key.length();i++){
			int index=key.charAt(i)-'a';
			if(temp.children[index]==null){
				return false;
			}
			temp=temp.children[index];
		}
		
		if(temp.isEndOfString==true){
			temp.isEndOfString=false;
			return true;
		}		
		return false;
	}

}
