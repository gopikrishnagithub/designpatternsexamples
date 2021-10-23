package com.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton firstinstance=Singleton.getInstance();
		System.out.println(firstinstance);
		Singleton secondinstance=Singleton.getInstance();
		System.out.println(secondinstance);

	}

}
