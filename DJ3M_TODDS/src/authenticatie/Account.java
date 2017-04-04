package authenticatie;

public class Account {
	private String username;
	protected byte [] password;
	protected byte [] salt;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public byte [] getPassword() {
		return password;
	}
	public void setPassword(byte [] password) {
		this.password = password;
	}
	public byte[] getSalt() {
		return salt;
	}
	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

}
