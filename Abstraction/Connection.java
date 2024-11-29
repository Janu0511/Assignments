package Abstraction;

public abstract class Connection implements DatabseConnection{

	//implementing the methods created in databaseconnection
	@Override
	public void connect() {
	System.out.println("connection is given");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected status");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("update is executed");
		
	}
}
