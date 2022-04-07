package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="treatment")
public class Treatment {
	
@Column(name="did")
protected int did;

@Column(name="pid")
protected int pid;

@Column(name="dname")
protected String dname;

@Column(name="pname")
protected String pname;

@Column(name="prescription_or_justcheck")
protected String prescription_or_justcheck;

@Column(name="date")
protected String date;

@Column(name="dolab_or_not")
protected String dolab_or_not;

public Treatment(int did, String dname, int pid, String pname, String prescription_or_justcheck, String date,
		String dolab_or_not) {
	super();
	this.did = did;
	this.dname = dname;
	this.pid = pid;
	this.pname = pname;
	this.prescription_or_justcheck = prescription_or_justcheck;
	this.date = date;
	this.dolab_or_not = dolab_or_not;
}
@Override
public String toString() {
	return "Treatment [did=" + did + ", dname=" + dname + ", pid=" + pid + ", pname=" + pname
			+ ", prescription_or_justcheck=" + prescription_or_justcheck + ", date=" + date + ", dolab_or_not="
			+ dolab_or_not + "]";
}

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPrescription_or_justcheck() {
	return prescription_or_justcheck;
}
public void setPrescription_or_justcheck(String prescription_or_justcheck) {
	this.prescription_or_justcheck = prescription_or_justcheck;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDolab_or_not() {
	return dolab_or_not;
}
public void setDolab_or_not(String dolab_or_not) {
	this.dolab_or_not = dolab_or_not;
}


}
