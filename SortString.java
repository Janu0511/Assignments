package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();

		name.add("HCL");
		name.add("Wipro");
		name.add("Aspire Systems");
		name.add("CTS");
		
		//sorting in alphabetical order
		Collections.sort(name);
		System.out.println("ascending order is:" +name);
		
		//to reverse the string
		for (int i = name.size()-1; i >=0; i--) {
			 
			System.out.println(name.get(i));
		
		}
	}

}
