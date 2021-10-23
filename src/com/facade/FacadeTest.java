package com.facade;

public class FacadeTest {
	
	public static void main(String[] args) {
		
		FacadePhone facadePhone=new FacadePhone();
		System.out.println(facadePhone.buildiphone());
		System.out.println(facadePhone.buildoneplus());
		System.out.println(facadePhone.buildnokia());
	}

}
