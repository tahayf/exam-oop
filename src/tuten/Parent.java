package tuten;


public class Parent extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Parent(String username, String password) {
		super(username, password);
	}
        
	
	@Override
	public String toString() {
		return "Parent [username= " + getUsername() + ", password= " + getPassword() + "]";
	}
	
}
