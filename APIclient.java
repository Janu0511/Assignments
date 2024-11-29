package week3.Day1;

public class APIclient {

	//one class with one input argument
	public void sendRequest(String endpoint) {
		System.out.println("" +endpoint);
	}
	//the same class accepting another 2 arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("end point: "+ endpoint);
		System.out.println("Request body: "+requestBody);
		System.out.println("verify whether the request is successful :"+requestStatus);
	}
	
	
	
	public static void main(String[] args) {
		//creating object to call the methods
				APIclient result = new APIclient();
				
				result.sendRequest("https://api.example.com/users/123?sort=asc");
				result.sendRequest("homepage", "body", true);
	}

}
