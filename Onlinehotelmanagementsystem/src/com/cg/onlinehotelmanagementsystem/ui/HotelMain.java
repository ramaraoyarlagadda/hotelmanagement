package com.cg.onlinehotelmanagementsystem.ui;

import java.util.Scanner;

import com.cg.onlinehotelmanagementsystem.dao.HotelDetails;
import com.cg.onlinehotelmanagementsystem.service.IHotel;
import com.cg.onlinehotelmanagementsystem.serviceimpl.HotelDetailsImpl;

public class HotelMain {

	public static void main(String[] args) {

		System.out.println("Hotel Management provides four operations for admin");
		System.out.println("1.Adding new hotel details\n2.View hotel details\n3.Modify hotel details\n4.Delete hotel details");
		System.out.println("Enter above mentioned number for performing that particular operation");
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		IHotel hotel=new HotelDetailsImpl();
		HotelDetails hoteldetails=new HotelDetails();
		switch (option) {
		case 1 :
			System.out.println("you entered option for addding hotel details");
			System.out.println("you need to provide details like\n 1.Hotelid\n2.Hotelname\n3.Hoteladdress\n4.Numberofrooms\n");
			int id=scanner.nextInt();
			String name=scanner.nextLine();
			String address=scanner.nextLine();
			int rooms=scanner.nextInt();
			hoteldetails.setHotelid(id);
			hoteldetails.setHotelname(name);
			hoteldetails.setHoteladdress(address);
			hoteldetails.setNoofrooms(rooms);
			
			break;
			case 2:

		default:
			break;
		}

		

	}

}
