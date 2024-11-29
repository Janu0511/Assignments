package Inheritance;

public class ExcecutionforTestData extends LoginTestData  {

	public static void main(String[] args) {
		
		ExcecutionforTestData login=new ExcecutionforTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
		
	}

}
