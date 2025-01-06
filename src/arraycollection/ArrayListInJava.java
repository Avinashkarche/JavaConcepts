package arraycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ArrayListInJava {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		LinkedList<Integer> arrayList1 = new LinkedList<Integer>();
		
		System.out.println(arrayList.add(null));
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(0, 105);    // it not replace value it add value in index 1 and it forwarding
		arrayList.add(1, 105);
		arrayList.set(0, 111);    // It replace the value 
		arrayList.remove(2);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		//If indexOff method return -1 that this tell not available value in List
		System.out.println(arrayList.indexOf(111));   //in that method we give list value and it gives index Of it 
		
		System.out.println(arrayList.lastIndexOf(40));
		
		
		System.out.println(arrayList);
		
		
		//This methods we achieve in LinkedList
		arrayList1.addFirst(20);
		arrayList1.addLast(200);
		System.out.println(arrayList1);
		
		arrayList.addAll(0, arrayList1);   //Adding two list 
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(3));  // return Value Of Index
		
		
		//For iteration Of ArrayList
		for(Integer list:arrayList)
		{
			System.out.println("Value of arrayList is "+list);
		}
		
		//Second Way Traditional forLoop
		
	    for(int i=0;i<arrayList.size();i++)
	    {
	    	System.out.println(arrayList.get(i));
	    }
	    
	    //Using Iterator 
	    
	    Iterator<Integer> iteratedValues = arrayList.iterator();
	    
	    while(iteratedValues.hasNext())
	    {
	    	System.out.println("ArrayList Iteration Using Iterator "+iteratedValues.next());
	    	
	    }
	    
	    System.out.println("Sub List "+arrayList.subList(0, 4));  //gives list from giving index from to index
		 
	    Integer value = 20; 
		System.out.println(arrayList.remove(value));     //return Boolean and only pass ref var and null and String
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains(105));
		
		
		//For Internal memory management
		 arrayList.ensureCapacity(200);		 
		 arrayList.trimToSize();
		 System.out.println(arrayList.size());
		
		System.out.println(arrayList.isEmpty());
		
		Object[] array = arrayList.toArray();  // For converting in array and access all methods in Array
		
		
		 for (Object obj : array) {
			 
	            System.out.println(obj);
	        }
		 arrayList.clear();
		 
		 System.out.println("**************************");
		 System.out.println(array[2]);
	}
	

}
