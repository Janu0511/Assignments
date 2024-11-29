package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
	
		//list of numbers
		List<Integer> num = new ArrayList<Integer>();
	     num.add(3);
	     num.add(2);
	     num.add(11);
	     num.add(4);
	     num.add(6);
	     num.add(7);
	     
	     //arranging the number in ascending order
	     num.sort(null);
	     System.out.println(num);
	     
	     //to get the 2nd largest no using get method
	     
	     Integer SecondLargest = num.get(4);
	     System.out.println("The second largest number is:" +SecondLargest);
	
		
	}

	}


