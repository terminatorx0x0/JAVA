package dataStructure;
import java.util.*;  
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java.util.ArrayList<String> list=new java.util.ArrayList<>();
		 * list.add("Ram"); list.add("Sita"); System.out.println(list);
		 */
   
   java.util.List<Integer> list=new  java.util.LinkedList();
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(50);
   System.out.println(list);
   list.add(2,80);
   System.out.println(list);
   
   java.util.List<Integer> newList=new  java.util.ArrayList();
   list.add(100);
   list.add(200);
   list.add(300);
   list.add(400);
   list.add(500);
   list.addAll(newList);
   System.out.println(list);
   
   System.out.println(list.get(8));
   
   list.remove(5);
   System.out.println(list);
   
   list.remove(Integer.valueOf(300));
   System.out.println(list);
   
   list.set(5, 0);
   System.out.println(list);
   
   System.out.println(list.contains(20));
   
   for(int i=0;i<list.size();i++)
   {
	   System.out.println("by for loop "+list.get(i));
   }
   for(Integer element:list)
   {
	   System.out.println("by foreach loop "+element);
   }
   Iterator<Integer> it=list.iterator();
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
   
   list.clear();
   System.out.println(list);
   
   System.out.println(list.isEmpty());
}
}