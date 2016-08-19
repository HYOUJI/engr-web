package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class WebUser {

	private String name;
	private String email;
	private String password;
	private String user;

	public WebUser() {

	}

	public WebUser(String name, String email, String password, String user) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "WebUser [name=" + name + ", email=" + email + ", password=" + password + "user=" + user + "]";
	}
}