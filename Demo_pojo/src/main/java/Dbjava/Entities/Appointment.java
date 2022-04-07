package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="did")
    protected String did;
	
	@Column(name="pid")
    protected String pid;
	
	@Column(name="dname")
    protected String dname;
	
	@Column(name="pname")
    protected String pname;
	
	@Column(name="fees")
    protected int fees;
	
	@Column(name="apppointmentdate")
    protected String appointmentdate;
    
    
    
	@Override
	public String toString() {
		return "Appointment [did=" + did + ", pid=" + pid + ", dname=" + dname + ", pname=" + pname + ", fees=" + fees
				+ ", appointmentdate=" + appointmentdate + "]";
	}



	public Appointment(String did, String pid, String dname, String pname, int fees, String appointmentdate) {
		super();
		this.did = did;
		this.pid = pid;
		this.dname = dname;
		this.pname = pname;
		this.fees = fees;
		this.appointmentdate = appointmentdate;
	}



	public String getDid() {
		return did;
	}



	public void setDid(String did) {
		this.did = did;
	}



	public String getPid() {
		return pid;
	}



	public void setPid(String pid) {
		this.pid = pid;
	}



	public String getDname() {
		return dname;
	}



	public void setDname(String dname) {
		this.dname = dname;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getFees() {
		return fees;
	}



	public void setFees(int fees) {
		this.fees = fees;
	}



	public String getAppointmentdate() {
		return appointmentdate;
	}



	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
    
    
    
	
	
	
}
