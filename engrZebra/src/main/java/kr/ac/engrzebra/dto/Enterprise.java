package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class Enterprise {

	private String companyName;
	private String email;
	private String password;
	
	public Enterprise(){
		
	}

	public Enterprise(String companyName, String email, String password){
		this.companyName = companyName;
		this.email = email;
		this.password = password;
	}
}