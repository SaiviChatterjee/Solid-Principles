package com.cognizant.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner sc=new Scanner(System.in);
		String processOption = sc.nextLine().toLowerCase().trim();
		String productDetails = "";
		
		Phone phone = new Phone();
		Accessory accessory = new Accessory();
		
		switch(processOption) {
		
		case "order" :
			System.out.println("Please provide the phone model name");
			productDetails = sc.nextLine().trim();
			phone.ProcessOrder(productDetails);
			break;
		case "repair" :
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().toLowerCase();
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetails = sc.nextLine().trim();
				phone.ProcessPhoneRepair(productDetails);
				
			}
			else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetails = sc.nextLine().trim();
				accessory.ProcessAccessoryRepair(productDetails);
			}
			break;
		default:
			break;
		}

		sc.close();

	}

}
