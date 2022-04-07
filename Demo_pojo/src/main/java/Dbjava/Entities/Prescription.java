package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prescription")
public class Prescription {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="pid")
protected int pid;

@Column(name="did")
protected int did;

@Column(name="medicalname")
protected String medicalname;

@Column(name="dose_per_day")
protected int dose_per_day;

@Column(name="days")
protected int days;

@Column(name="labtestname")
protected String labtestname;

public Prescription(int pid, int did, String medicalname, int dose_per_day, int days, String labtestname) {
	super();
	this.pid = pid;
	this.did = did;
	this.medicalname = medicalname;
	this.dose_per_day = dose_per_day;
	this.days = days;
	this.labtestname = labtestname;
}

@Override
public String toString() {
	return "Prescription [pid=" + pid + ", did=" + did + ", medicalname=" + medicalname + ", dose_perday=" + dose_per_day
			+ ", days=" + days + ", labtestname=" + labtestname + "]";
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getMedicalname() {
	return medicalname;
}

public void setMedicalname(String medicalname) {
	this.medicalname = medicalname;
}

public int getDose_perday() {
	return dose_per_day;
}

public void setDose_per_day(int dose_per_day) {
	this.dose_per_day = dose_per_day;
}

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}

public String getLabtestname() {
	return labtestname;
}

public void setLabtestname(String labtestname) {
	this.labtestname = labtestname;
}



	
	
}
