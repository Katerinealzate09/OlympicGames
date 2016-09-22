package co.com.udem.OlympicGames.model;

import java.io.Serializable;

public class AthletesDTO implements Serializable{

	private static final long serialVersionUID = 8228977204425292829L;
	private String image;
	private String name;
	private String sport;
	private String nationality;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
