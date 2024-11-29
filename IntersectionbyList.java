package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionbyList {

	public static void main(String[] args) {
		//list1
		List<Integer> subject=new ArrayList<Integer>();
		
		subject.add(3);
		subject.add(2);
		subject.add(11);
		subject.add(4);
		subject.add(6);
		subject.add(7);
		
		//list2
		List<Integer> sub=new ArrayList<Integer>();
		
		sub.add(1);
		sub.add(2);
		sub.add(8);
		sub.add(4);
		sub.add(9);
		sub.add(7);
		
		int size = subject.size();
		System.out.println("Length of array1:" +size);
		
		int size2 = sub.size();
		System.out.println("Length of array2:" +size2);
		
		boolean equals = subject.equals(sub);
		System.out.println(equals);
		
		//for (Integer num : subject) {  
	          //  if (sub.contains(num)) {  
	              //  System.out.println(num); 
		//another method
		
		 // Get the current element 
	                for (int i = 0; i < subject.size(); i++) {  
	                    Integer num = subject.get(i); 
	                    // Check if this element is in array2  
	                   if (sub.contains(num)) {  
	                       System.out.println(num); 
			
	}}
		 }}
		
		
		
		
		
		 
		 
		 
		


