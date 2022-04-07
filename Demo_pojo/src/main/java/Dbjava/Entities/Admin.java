package Dbjava.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
   
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="username")
   protected String username;
   
   @Column(name="password")
   protected String password;
   
   
@Override
public String toString() {
	return "Admin [username=" + username + ", password=" + password + "]";
}
public Admin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
	
	
	
}
