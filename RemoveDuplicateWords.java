package week3.Day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
		// Initialize counter for duplicates 
		int count=0;
		 // Split the text into an array of words
		String[] word = text.split(" ");
	
		// Using nested loops to compare each word with every other word 
		for (int i = 0; i < word.length; i++) {
			
			for (int j = i+1; j < word.length; j++) {
		// Check for duplicates using equalsIgnoreCase for case-insensitive comparison 
				if ( word[i].equalsIgnoreCase((word)[j])) {
					
					word[j]= " ";
					count++;
				}
				
			}
		
		} 
		// Print the modified words only if duplicates were found 
		if (count>0) {
			System.out.println("Count of duplicate words are:" +count);
			
			for (int i = 0; i < word.length; i++) {
				System.out.print(word[i] +" ");
			}}
			else {
				System.out.print("No duplicates found" +text);
			
			}
		}
	}

