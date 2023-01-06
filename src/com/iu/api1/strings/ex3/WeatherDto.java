package com.iu.api1.strings.ex3;

public class WeatherDto {
	private String city; //지역
	private String gion; //기온
	private String status; //날씨
	private String mise; //미세먼지
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGion() {
		return gion;
	}
	public void setGion(String gion) {
		this.gion = gion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMise() {
		return mise;
	}
	public void setMise(String mise) {
		this.mise = mise;
	}
	
}
