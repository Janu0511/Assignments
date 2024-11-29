package week3.Day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String test= "changeme";
		
		//to get the string into seperate character
		char[] array = test.toCharArray();
		//to iterate the array index 
		for (int i = 0; i < array.length; i++) {
			
			//to get odd numbers and print it in uppercase
			if (i%2==1) {
				
				System.out.print(Character.toUpperCase(array[i]));
			}
			else {
				System.out.print(array[i]);
			}
		}
				

	}

}
