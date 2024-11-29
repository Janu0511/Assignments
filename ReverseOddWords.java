package week3.Day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		        String test = "I am a software tester";  

		        String[] word = test.split(" ");  
		        
		        for (int i = 0; i < word.length; i++) {  
		            if (i % 2 == 1) { 
		            	//iterate to get odd index array
		                char[] odd = word[i].toCharArray();
		                
		                //loop to reverse the odd indexes array word
		               for (int j = odd.length - 1; j >= 0; j--) {  
		                   System.out.print(odd[j]); // Print the characters in reverse  
		                }  
		                System.out.print(" "); // Add a space after odd indexed words  
		            } else {  
		                System.out.print(word[i] + " "); // Print the word as it is for even index 
		            }  
		        }  
	}}
		 
			
		

	


