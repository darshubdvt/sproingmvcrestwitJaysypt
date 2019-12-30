package com.evolvusion.easba.pojo;

public class AsbaWsBean {
	
	private String issname;
	
	private String bidrate;

	public String getIssname() {
		return issname;
	}

	public void setIssname(String issname) {
		this.issname = issname;
	}

	public String getBidrate() {
		return bidrate;
	}

	public void setBidrate(String bidrate) {
		this.bidrate = bidrate;
	}

	@Override
	public String toString() {
		return "AsbaWsBean [issname=" + issname + ", bidrate=" + bidrate + "]";
	}
	
	
	
}
