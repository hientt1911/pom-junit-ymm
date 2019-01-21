package vn.mmj.ymeetme.models;

public class UserAccount {

	private String email;
	private String pass;
	
	public UserAccount(String email, String pass) {
		this.setEmail(email);
		this.setPass(pass);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
