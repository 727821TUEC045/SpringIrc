package com.example.day3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jack")
public class CarModel {
	@Id
	@Column(name="cid")
private int cid;
private String cname;
private String caddress;
private int cphone;
private String ccity;
private String  cmodel;
private int ccolour;
private String cdeliveydate;
private int ckgs;
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
public int getCphone() {
	return cphone;
}
public void setCphone(int cphone) {
	this.cphone = cphone;
}
public String getCcity() {
	return ccity;
}
public void setCcity(String ccity) {
	this.ccity = ccity;
}
public String getCmodel() {
	return cmodel;
}
public void setCmodel(String cmodel) {
	this.cmodel = cmodel;
}
public int getCcolour() {
	return ccolour;
}
public void setCcolour(int ccolour) {
	this.ccolour = ccolour;
}
public String getCdeliveydate() {
	return cdeliveydate;
}
public void setCdeliveydate(String cdeliveydate) {
	this.cdeliveydate = cdeliveydate;
}
public int getCkgs() {
	return ckgs;
}
public void setCkgs(int ckgs) {
	this.ckgs = ckgs;
}

}
