package com.adapter;

public class AdapterExampleTest {
	
	public static void main(String[] args) {
		
		AndroidCharger androidCharger=new AndroidCharger();
		AndroidPhone androidPhone=new OnePlusPhone();
		androidCharger.charge(androidPhone);
		
		IPhoneCharger iPhoneCharger=new IPhoneCharger();
		IPhone iPhone=new IphoneX();
		iPhoneCharger.charge(iPhone);
		
		AndroidToIphoneAdapter iphoneadapter=new AndroidToIphoneAdapter(androidPhone);
		iPhoneCharger.charge(iphoneadapter);
		
		IphoneToAndroidAdapter androidadapter=new IphoneToAndroidAdapter(iPhone);
		androidCharger.charge(androidadapter);
	}

}
