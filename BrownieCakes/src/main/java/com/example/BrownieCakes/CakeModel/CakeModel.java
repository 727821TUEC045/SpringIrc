package com.example.BrownieCakes.CakeModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jack")
public class CakeModel {
	  @Id
	  @Column(name="cphoneno")
	private String cname;
	private String caddress;
	private int cphoneno;
	private String ccity;
	private int cpincode;
	private String citem;
	private int ckgs;
	private String cdeliverydate;
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
	public int getCphoneno() {
		return cphoneno;
	}
	public void setCphoneno(int cphoneno) {
		this.cphoneno = cphoneno;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public int getCpincode() {
		return cpincode;
	}
	public void setCpincode(int cpincode) {
		this.cpincode = cpincode;
	}
	public String getCitem() {
		return citem;
	}
	public void setCitem(String citem) {
		this.citem = citem;
	}
	public int getCkgs() {
		return ckgs;
	}
	public void setCkgs(int ckgs) {
		this.ckgs = ckgs;
	}
	public String getCdeliverydate() {
		return cdeliverydate;
	}
	public void setCdeliverydate(String cdeliverydate) {
		this.cdeliverydate = cdeliverydate;
	}

}
