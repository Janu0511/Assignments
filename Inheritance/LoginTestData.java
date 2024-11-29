package Inheritance;

public abstract class LoginTestData implements TestDataInheritance  {

	public static void main(String[] args) {
	}

	@Override
	public void enterCredentials() {
		System.out.println("Enter credential page pops up");
	
		
	}

	@Override
	public void navigateToHomePage() {
		System.out.println("If no page loads,naviagte to home page");
		
	}

	public void enterUsername() {
		System.out.println("Enter username details");
		
	}
	public void enterPassword() {
		System.out.println("Enter password");
	}
	
}
