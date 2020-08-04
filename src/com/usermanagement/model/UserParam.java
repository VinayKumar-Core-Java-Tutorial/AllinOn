package com.usermanagement.model;

import java.security.SecureRandom;
import org.apache.commons.lang3.RandomStringUtils;

public class UserParam {
	private int id;
	private String uname,upwd,uemail,fcheck,fname,fpwd,gcheck,gname,gpwd,firstname,lastname,uniqueid;
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid() {
		SecureRandom random = new SecureRandom();
	    int num = random.nextInt(100000);
	    String formatted = String.format("%05d", num); 
	    String unqid = (getFirstname().toUpperCase())+formatted;
		this.uniqueid = unqid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String firstname,String lastname) {
		this.uname = firstname+lastname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd() {    
		String upwd = RandomStringUtils.randomAlphanumeric(10);
		this.upwd = upwd;
	}
	public void setUpwd(String upwd) {    
		this.upwd = upwd;
	}
	
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getFcheck() {
		return fcheck;
	}
	public void setFcheck(String fcheck) {
		
		if("1".equals(fcheck)) {
			this.fcheck = fcheck;
		}
		else {
			this.fcheck = "0";
		}
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		if((fname !=null)&&("1".equals(fcheck))) {
			this.fname = fname;
		}
		else {
			this.fname = "-";
		}
	}
	public String getFpwd() {
		return fpwd;
		
	}
	public void setFpwd(String fpwd) {
		if((fpwd !=null) && ("1".equals(fcheck))) {
			this.fpwd = fpwd;
		}
		else {
			this.fpwd = "-";
		}
		
	}
	public String getGcheck() {
		return gcheck;
	}
	public void setGcheck(String gcheck) {
		
		if("1".equals(gcheck)) {
			this.gcheck = gcheck;
		}
		else {
			this.gcheck = "0";
		}
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		if((gname !=null)&&("1".equals(gcheck))) {
			this.gname = gname;
		}
		else {
			this.gname = "-";
		}
	}
	public String getGpwd() {
		return gpwd;
	}
	public void setGpwd(String gpwd) {
		if((gpwd !=null)&&("1".equals(gcheck))) {
			this.gpwd = gpwd;
		}
		else {
			this.gpwd = "-";
		}
	}
}
