package com.cognizant.com;

public class Phone implements PhoneI {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " order accepted!");

	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " repair accepted!");

	}

}
