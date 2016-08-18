package kr.ac.engrzebra.dto;

import lombok.Data;

@Data
public class AppApply {

	private String barcode;
	private String id;
	private String productName;
	
	public AppApply(){
		
	}
	
	@Override
	public String toString() {
		return "\"barcode\"=\"" + barcode + "\", \"id\"=\"" + id + "\", \"productName\"=\"" + productName + "\"";
	}
}
