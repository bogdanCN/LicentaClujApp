package clujWebApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Building {
	
	@Id
	@Column(name="idBuilding")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBuilding;
	@Column(name="nameBuilding")
	private String nameBuilding;
	@Column(name="adress")
	private String adress;
	@Column(name="description")
	private String description;

	public Building() {
		
	}

	public Building(int idBuilding, String nameBuilding, String adress, String description) {
		super();
		this.idBuilding = idBuilding;
		this.nameBuilding = nameBuilding;
		this.adress = adress;
		this.description = description;
	}

	public int getIdBuilding() {
		return idBuilding;
	}

	public void setIdBuilding(int idBuilding) {
		this.idBuilding = idBuilding;
	}

	public String getNameBuilding() {
		return nameBuilding;
	}

	public void setNameBuilding(String nameBuilding) {
		this.nameBuilding = nameBuilding;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
