package Abstraction;

public class JavaConnection extends Connection {
	
	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
		
	}

}
