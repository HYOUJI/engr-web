package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class Review {

	private String id;
	private String barcode;
	private String reviewText;
	private double starPoint;
	private String level;
	private String memberUrl;
	private String productUrl;
	
	public Review() {

	}

	public Review(String id, String barcode, String reviewText, double starPoint, String level) {
		super();

		this.id = id;
		this.barcode = barcode;
		this.reviewText = reviewText;
		this.starPoint = starPoint;
		this.level = level;
	}	

	@Override
	public String toString() {
		return "{\"id\"=\"" + id + "\", \"reviewText\"=\"" + reviewText + "\", \"starPoint\"=" + starPoint
				+ ", \"level\"=\"" + level + "\", \"memberUrl\"=\"" + memberUrl + "\", \"productUrl\"=\"" + productUrl
				+ "\"}";
	}
	
}