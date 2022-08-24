package dataStructure;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  java.util.Stack<String> anime=new java.util.Stack<>();
  anime.push("dog");
  anime.push("cat");
  anime.push("ass");
  anime.push("owl");
  System.out.println(anime);
  
  System.out.println(anime.peek());
  
  anime.pop();
  System.out.println(anime);
	}

}
