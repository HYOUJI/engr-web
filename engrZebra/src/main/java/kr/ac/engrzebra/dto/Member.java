package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String password;
	private String name;
	private String memberUrl;
	private String lastReviewDate;
	private String phoneNumber;
	private String level;
	private int point;
	private int reviewCount;
	private int totalReviewCount;
	
	public Member(){
		
	}
	
	public Member(String id, String password, String name, String memberUrl, String lastReviewDate, String phoneNumber, String level,
				int point, int reviewCount, int totalReviewCount){
	    super();
		this.id = id;
	    this.password = password;
	    this.name = name;
	    this.memberUrl = memberUrl;
	    this.lastReviewDate = lastReviewDate;
	    this.phoneNumber = phoneNumber;
	    this.level = level;
	    this.point = point;
	    this.reviewCount = reviewCount;
	    this.totalReviewCount = totalReviewCount;
	}
	
	@Override
	public String toString() {
		return "{\"id\"=\"" + id + "\", \"name\"=\"" + name + "\", \"memberUrl\"=\"" + memberUrl + "\", \"lastReviewDate\"=\"" + lastReviewDate
				+ "\", \"phoneNumber\"=\"" + phoneNumber + "\", \"point\"=" + point + ", \"level\"=\"" + level + "\", \"reviewCount\"="
				+ reviewCount + ", \"totalReviewCount\"=" + totalReviewCount + "}";
	}
}
