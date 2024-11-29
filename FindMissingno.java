package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingno {

	public static void main(String[] args) {
		
		//creating list to find missing no using list
		List<Integer> list = new ArrayList<Integer>();

		 list.add(1);
	     list.add(2);
	     list.add(3);
	     list.add(4);
	     list.add(10);
	     list.add(6);
	     list.add(8);
	     
	     //sorting the list as array
	     Collections.sort(list);
			
			//using for loop to iterate
			for (int i = 0; i < list.size()-1; i++)
			{
				//comparing
	            int currentElement = list.get(i);
	            int nextElement = list.get(i+1);

	            // Check if current element + 1 is not equal to next element
	            if (currentElement+1!= nextElement) 
	            {
	               //Prints the missing elements
	            	System.out.println("Missing element are:" +(currentElement+1));
	}

		
	}}}
	     
	


