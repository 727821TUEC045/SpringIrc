package com.example.OnlineCakeShop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sweets")
public class CakeModel {
	
	@Id
	@Column(name="cid")
	
	
	private int cid;
	private String cname;
	private String caddress;
	private String email;
	private String ccity;
	private String citem;
	private int kgs;
	private int pincode;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCitem() {
		return citem;
	}
	public void setCitem(String citem) {
		this.citem = citem;
	}
	public int getKgs() {
		return kgs;
	}
	public void setKgs(int kgs) {
		this.kgs = kgs;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
