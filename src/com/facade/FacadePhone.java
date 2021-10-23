package com.facade;

public class FacadePhone {
	
	private Iphone iphone;
	private Nokia nokia;
	private Oneplus oneplus;
	
	public FacadePhone() {
		iphone=new  Iphone();
		nokia=new Nokia();
		oneplus=new Oneplus();
	}
	
	
	public String buildiphone() {
		return iphone.build();
	}
	
	public String buildnokia() {
		return nokia.build();
	}
	
	public String buildoneplus() {
		return oneplus.build();
	}

}
