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
import com.cg.onlinehotelmanagementsystem.service.IBooking;
import com.cg.onlinehotelmanagementsystem.service.IHotel;
import com.cg.onlinehotelmanagementsystem.serviceimpl.BookRoomImpl;
import com.cg.onlinehotelmanagementsystem.serviceimpl.HotelDetailsImpl;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;
import com.cg.onlinehotelmanagementsystem.utility.ValidCity;
import com.cg.onlinehotelmanagementsystem.utility.ValidHotel;
import com.cg.onlinehotelmanagementsystem.utility.ValidHotelDetails;
import com.cg.onlinehotelmanagementsystem.utility.ValidRoom;


public class HmsMain {

	public static void main(String[] args){
		/*hotel object for the hoteldetailsimpl class*/
		IHotel hotel=new HotelDetailsImpl();
		/*hoteldetails is the object for hoteldetails entity class*/
		HotelDetailsDTO hoteldetails=new HotelDetailsDTO();
	
		while(true)
		{
		System.out.println("Hotel Management provides four operations for admin");
		System.out.println("1.Adding new hotel details\n2.View hotel details\n3.Modify hotel details\n4.Delete hotel details");
		System.out.println("Enter above mentioned number for performing that particular operation");
		Scanner scanner=new Scanner(System.in);
		/*Takes input from the user to perform operation based on his opinion*/
		int option=scanner.nextInt();
	   try {
		switch (option) {
		case 1:
			
			/* This case deals with adding hotel details object creation and invoking method*/
			System.out.println("you entered option for adding hotel details");
			System.out.println("First for adding hotel you need to enter hotel details like\n1.hotelid\n2.Hotelname\n3.Hoteladdress\n4.Number of rooms");
			int hotelId=scanner.nextInt();
			String hotelName=scanner.next();
			String hotelAddress=scanner.next();
			int noofRooms=scanner.nextInt();
			hoteldetails.setHotelid(hotelId);
			 ValidHotelDetails.isValidHotelId(hotelId);
			hoteldetails.setHotelname(hotelName);
			 ValidHotelDetails.isValidHotelName(hotelName);
			hoteldetails.setHoteladdress(hotelAddress);
			ValidHotelDetails .isValidHotelAddress(hotelAddress);
			hoteldetails.setNoofrooms(noofRooms);
			 ValidHotelDetails.isValidNumOfRoom(noofRooms);
			ListData.hotelList(hoteldetails);
			hoteldetails=hotel.addHotelDetails(hoteldetails);
			System.out.println("Hotel details added successfully");
			break;
		case 2:
			/*This case deals with viewing hotel details object creation and invoking method*/
			try {
			System.out.println("you entered option for viewing hotel details");
			System.out.println("Enter hotelid for viewing hotel details");
			int hotelid=scanner.nextInt();
			hotel.viewHotelDetails(hotelid);
			}
			catch (HotelIdException ide) {
				System.out.println(ide.getMessage());
			}
			break;
		case 3:
			/*This case deals with modifing hotel details object creation and invoking method*/
			try {
			System.out.println("you entered option for modifing hotel details");
			System.out.println("Enter your choice for modifing detailsl for\n 1.Hotelid\n 2.Hotelname\n 3.Hoteladdress\n 4. Number of rooms");
			int modifyid=scanner.nextInt();
			hotel.modifyHotelById(modifyid);
			}
			catch (HotelIdException ide) {
				System.out.println(ide.getMessage());
			}
			break;
		case 4:
			try {
			/*This case deals with deleting hotel details object creation and ivoking method*/
			System.out.println("you entered option for deleting hotel details");
			System.out.println("Enter hotelid for deleting hotel details");
			int hotelid=scanner.nextInt();
			hoteldetails=hotel.deleteHotelDetails(hoteldetails);
			hotel.deleteHotelDetails(hoteldetails);
			}
			catch (HotelIdException ide) {
				System.out.println(ide.getMessage());
			}
			break;
		default:
			/*It gets executes when above mentioned options are not entered*/
			System.err.println("you not entered the options which are shown above");
			System.out.println("please select options that are mentioned above");
			break;
		}
	   }
      catch(Exception e ) {
    	  System.out.println(e.getMessage());
      }
	}}
}
