package com.bean;
// use to return values for reducing the burden, performance enhancement
public class AttackBean {

	private String fid, email, own, ip, da;
	private int fcount;
	
	public int getFcount() {
		return fcount;
	}

	public void setFcount(int fcount) {
		this.fcount = fcount;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOwn() {
		return own;
	}

	public void setOwn(String own) {
		this.own = own;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}
}
