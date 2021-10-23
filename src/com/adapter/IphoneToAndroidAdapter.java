package com.adapter;

public class IphoneToAndroidAdapter implements AndroidPhone{
	
	IPhone iPhone;
	
	public IphoneToAndroidAdapter(IPhone iPhone) {
		this.iPhone=iPhone;
	}

	@Override
	public void charge() {
		iPhone.charge();
	}

}
