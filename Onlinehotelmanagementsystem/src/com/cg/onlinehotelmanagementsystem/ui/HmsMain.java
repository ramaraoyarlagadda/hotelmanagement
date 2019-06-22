package com.cg.onlinehotelmanagementsystem.ui;

import java.util.Scanner;
import com.cg.onlinehotelmanagementsystem.dao.*;
import com.cg.onlinehotelmanagementsystem.exception.AreaNameException;
import com.cg.onlinehotelmanagementsystem.exception.CityNameException;
import com.cg.onlinehotelmanagementsystem.exception.DateCheckInException;
import com.cg.onlinehotelmanagementsystem.exception.DateCheckOutException;
import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NoRoomAvailable;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;
import com.cg.onlinehotelmanagementsystem.exception.PersonExceedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomAlreadyBookedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomNameException;
import com.cg.onlinehotelmanagementsystem.service.IBookRoom;
import com.cg.onlinehotelmanagementsystem.service.IHotel;
import com.cg.onlinehotelmanagementsystem.serviceimpl.BookRoomImpl;
import com.cg.onlinehotelmanagementsystem.serviceimpl.HotelDetailsImpl;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;
import com.cg.onlinehotelmanagementsystem.utility.ValidCity;
import com.cg.onlinehotelmanagementsystem.utility.ValidHotel;
import com.cg.onlinehotelmanagementsystem.utility.ValidRoom;


public class HmsMain {

	public static void main(String[] args){
		System.out.println("Hotel Management provides four operations for admin");
		System.out.println("1.Adding new hotel details\n2.View hotel details\n3.Modify hotel details\n4.Delete hotel details");
		System.out.println("Enter above mentioned number for performing that particular operation");
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		IHotel hotel=new HotelDetailsImpl();
		HotelDetails hotelDetails=new HotelDetails();
	   try {
		switch (option) {
		case 1:
			// This case deals with adding hotel details object creation and invoking method
			System.out.println("you entered option for adding hotel details");
			System.out.println("First for adding hotel you need to enter hotel details like\n1.hotelid\n2.Hotelname\n3.Hoteladdress\n4.Number of rooms");
			int id=scanner.nextInt();
			String name=scanner.next();
			String address=scanner.next();
			int rooms=scanner.nextInt();
			hotelDetails.setHotelid(id);
			hotelDetails.setHotelname(name);
			hotelDetails.setHoteladdress(address);
			hotelDetails.setNoofrooms(rooms);
			ListData.hotelList(hotelDetails);
			hotel.addHotelDetails(hotelDetails);
			System.out.println("Hotel details added successfully");
		case 2:
			//This case deals with viewing hotel details object creation and invoking method
			System.out.println("you entered option for viewing hotel details");
			int viewHotelId=scanner.nextInt();
			hotel.viewHotelDetails(viewHotelId);
			break;
		case 3:
			//This case deals with modifing hotel details object creation and invoking method
			System.out.println("you entered option for modifing hotel details");
			int modifyId=scanner.nextInt();
			hotel.modifyHotelDetails(modifyId);
			break;
		case 4:
			//This case deals with deleting hotel details object creation and ivoking method
			System.out.println("you entered option for deleting hotel details");
			int deleteId=scanner.nextInt();
			hotel.deleteHotelDetails(deleteId);
			break;
		default:
			//It gets executes when above mentioned options are not entered
			System.err.println("you not entered the options which are shown above");
			System.out.println("please select options that are mentioned ");
			break;
		}
	   }
      catch(Exception e ) {
    	  System.out.println(e.getMessage());
      }
	}
}
