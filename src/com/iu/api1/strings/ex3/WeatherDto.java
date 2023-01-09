package com.iu.api1.strings.ex3;

public class WeatherDto {
	private String city; //지역
	private int gion; //기온
	private String status; //날씨
	private int mise; //미세먼지
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMise() {
		return mise;
	}
	public void setMise(int mise) {
		this.mise = mise;
	}
	
}
