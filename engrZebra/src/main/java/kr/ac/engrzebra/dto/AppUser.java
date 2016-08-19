package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class AppUser {

	private String name;
	private String email;
	private String password;
	private String memberUrl;
	private String lastReviewDate;
	private String phoneNumber;
	private String level;
	private int point;
	private int reviewCount;
	private int totalReviewCount;
	
	public AppUser() {

	}

	public AppUser(String name, String email, String password, String phoneNumber, int point, String level, String memberUrl,
			String lastReviewDate, int reviewCount, int totalReviewCount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.point = point;
		this.level = level;
		this.memberUrl = memberUrl;
		this.lastReviewDate = lastReviewDate;
		this.reviewCount = reviewCount;
		this.totalReviewCount = totalReviewCount;
	}
	
	@Override
	public String toString() {
		return "{\"name\"=\"" + name + "\", \"email\"=\"" + email + "\", \"memberUrl\"=\"" + memberUrl + "\", \"lastReviewDate\"=\"" + lastReviewDate
				+ "\", \"phoneNumber\"=\"" + phoneNumber + "\", \"point\"=" + point + ", \"level\"=\"" + level + "\", \"reviewCount\"="
				+ reviewCount + ", \"totalReviewCount\"=" + totalReviewCount + "}";
	}
}