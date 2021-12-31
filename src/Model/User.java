package Model;

public class User {

	private int id;
	private String userName;
	private String password;
	public int getId() {
		return id;
	}
	
	public User() {
		
	}
	
    public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
    public User(int id,String userName, String password) {
    	this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	 
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "{ user "+userName +"password "+password+ "}";
	}
}
