package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	
	@Column(name="medicineid")
	protected int medicineid;
	
	@Column(name="medicinename")
    protected int medicinename;
	
	@Column(name="price")
    protected int price;
	
	@Column(name="medicalname")
    protected String medicalname;
	
	@Column(name="medicalid")
    protected int medicalid;
	
	@Column(name="stock")
    protected int stock;
    
	public Medicine(int medicineid, int medicinename, int price, String medicalname, int medicalid, int stock) {
		super();
		this.medicineid = medicineid;
		this.medicinename = medicinename;
		this.price = price;
		this.medicalname = medicalname;
		this.medicalid = medicalid;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medicine [medicineid=" + medicineid + ", medicinename=" + medicinename + ", price=" + price
				+ ", medicalname=" + medicalname + ", medicalid=" + medicalid + ", stock=" + stock + "]";
	}

	public int getMedicineid() {
		return medicineid;
	}

	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}

	public int getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(int medicinename) {
		this.medicinename = medicinename;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
    
    
	
	
}
