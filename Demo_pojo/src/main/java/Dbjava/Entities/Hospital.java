package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="hospid")
protected int hospid;

@Column(name="hospname")
protected String hospname;

@Column(name="hospadd")
protected String hospadd;

@Column(name="city")
protected String city;

@Column(name="availabletime")
protected String availableTime;

@Column(name="mobileno")
protected int mobileno;

@Column(name="icubed")
protected int icubed;

@Column(name="normalbed")
protected String normalbed;

@Column(name="treatmenttype")
protected String treatmenttype;

@Column(name="govorprivate")
protected String govorprivate;

public Hospital(int hospid, String hospname, String hospadd, String city, String availableTime, int mobileno,
		int icubed, String normalbed, String treatmenttype, String govorprivate) {
	super();
	this.hospid = hospid;
	this.hospname = hospname;
	this.hospadd = hospadd;
	this.city = city;
	this.availableTime = availableTime;
	this.mobileno = mobileno;
	this.icubed = icubed;
	this.normalbed = normalbed;
	this.treatmenttype = treatmenttype;
	this.govorprivate = govorprivate;
}

@Override
public String toString() {
	return "Hospital [hospid=" + hospid + ", hospname=" + hospname + ", hospadd=" + hospadd + ", city=" + city
			+ ", availableTime=" + availableTime + ", mobileno=" + mobileno + ", icubed=" + icubed + ", normalbed="
			+ normalbed + ", treatmenttype=" + treatmenttype + ", govorprivate=" + govorprivate + "]";
}

public int getHospid() {
	return hospid;
}

public void setHospid(int hospid) {
	this.hospid = hospid;
}

public String getHospname() {
	return hospname;
}

public void setHospname(String hospname) {
	this.hospname = hospname;
}

public String getHospadd() {
	return hospadd;
}

public void setHospadd(String hospadd) {
	this.hospadd = hospadd;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getAvailableTime() {
	return availableTime;
}

public void setAvailableTime(String availableTime) {
	this.availableTime = availableTime;
}

public int getMobileno() {
	return mobileno;
}

public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}

public int getIcubed() {
	return icubed;
}

public void setIcubed(int icubed) {
	this.icubed = icubed;
}

public String getNormalbed() {
	return normalbed;
}

public void setNormalbed(String normalbed) {
	this.normalbed = normalbed;
}

public String getTreatmenttype() {
	return treatmenttype;
}

public void setTreatmenttype(String treatmenttype) {
	this.treatmenttype = treatmenttype;
}

public String getGovorprivate() {
	return govorprivate;
}

public void setGovorprivate(String govorprivate) {
	this.govorprivate = govorprivate;
}


	
}
