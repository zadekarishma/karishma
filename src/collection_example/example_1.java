package collection_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example_1 
{

	public static void main(String[] args) 
	{
	 //create object of arraylist
		ArrayList a=new ArrayList();
		
		//insrt value
		a.add(12);
		a.add("rama");
		a.add(23);
		System.out.println(a);
		a.add(2,"kaju");
		System.out.println(a);
		//second array
		ArrayList a1=new ArrayList();
		a1.add(23);
		a1.add(5.6);
		a1.add("pari");
		//combine to arraylist
		a.addAll(a1);
		System.out.println(a);
		//delete value
		a.remove("pari");
		System.out.println(a);
		//replace value
		a.set(4, 450);
		System.out.println(a);
		//fetch by using for loop
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		//foreachlopp
		for(Object s:a)
			
		{
			System.out.println(s);
			
		}
		//using iterator
		Iterator p1=a.iterator();
		while(p1.hasNext())
		{
			System.out.println(p1.next());
			
		}
		System.out.println("----------");
		//using list iterator
		ListIterator g=a.listIterator();
		while(g.hasPrevious())
		{
		System.out.println(g);	
		}
		System.out.println("*******");
		while(g.hasNext())
		{
			System.out.println(g.next());
		}
		System.out.println("****");
		//check particular elemenent present or not 
		Boolean result=a.contains(12);
		System.out.println(result);
		//create generic arraylist
		ArrayList <Integer> a2=new <Integer>ArrayList();
		a2.add(3445);
		a2.add(23);
		System.out.println(a2);
		
		
		
	}

}
