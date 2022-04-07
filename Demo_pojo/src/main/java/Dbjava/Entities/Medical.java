package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medical")
public class Medical {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="medicalid")
	protected int medicalid;
	
	@Column(name="medicalname")
	protected String medicalname;
	
	@Column(name="medicalcity")
	protected String medicalcity;
	
	@Column(name="medicaladdress")
	protected String medicaladdress;
	
	@Column(name="availability")
	protected String availability;
	
	@Column(name="stock")
	protected int stock;
	
	public Medical(String medicalname, int medicalid, String medicalcity, String medicaladdress, String availability,
			int stock) {
		super();
		this.medicalname = medicalname;
		this.medicalid = medicalid;
		this.medicalcity = medicalcity;
		this.medicaladdress = medicaladdress;
		this.availability = availability;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Medical [medicalname=" + medicalname + ", medicalid=" + medicalid + ", medicalcity=" + medicalcity
				+ ", medicaladdress=" + medicaladdress + ", availability=" + availability + ", stock=" + stock + "]";
	}
	public String getMedicalname() {
		return medicalname;
	}
	public void setMedicalname(String medicalname) {
		this.medicalname = medicalname;
	}
	public int getMedicalid() {
		return medicalid;
	}
	public void setMedicalid(int medicalid) {
		this.medicalid = medicalid;
	}
	public String getMedicalcity() {
		return medicalcity;
	}
	public void setMedicalcity(String medicalcity) {
		this.medicalcity = medicalcity;
	}
	public String getMedicaladdress() {
		return medicaladdress;
	}
	public void setMedicaladdress(String medicaladdress) {
		this.medicaladdress = medicaladdress;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
