package tuten;

public class Child extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Child(String username, String password) {
		super(username, password);
	}

	@Override
	public String toString() {
		return "Child [username= " + getUsername() + ", password= " + getPassword() + "]";
	}
	
}
