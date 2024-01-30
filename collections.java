package com.collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<Integer> mySet=new HashSet();
		mySet.add(1);
		mySet.add(10);
		mySet.add(22);
		mySet.add(33);
		mySet.add(77);
		mySet.add(null);
		//1.display using mySet
		System.out.println(mySet);
		System.out.println("......................................");
		
		//2.display using for each loop
		
	for(Integer i: mySet)
	{
		System.out.println(i);
	}
	System.out.println(".....................................................");
	//3.using iterator
	
	Iterator<Integer> var=mySet.iterator();
	while(var.hasNext())
	{
		System.out.println(var.next());
	}
	System.out.println("...............................................");
	System.out.println(mySet.size());
	System.out.println("...........................................");
	System.out.println(mySet.contains(84));
	System.out.println("....................................................");
	System.out.println(mySet.isEmpty());
	System.out.println("...........................................");
	System.out.println(mySet.addAll(mySet));
	System.out.println(mySet);
	System.out.println(mySet.containsAll(mySet));
	System.out.println(mySet);
	System.out.println(mySet.removeAll(mySet));
	System.out.println(mySet);
	System.out.println(mySet.retainAll(mySet));
	System.out.println(mySet);
	
	
	}
}

	


