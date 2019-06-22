package com.cg.onlinehotelmanagementsystem.serviceimpl;

import java.util.List;

import com.cg.onlinehotelmanagementsystem.dao.HotelDetails;
import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;
import com.cg.onlinehotelmanagementsystem.service.IHotel;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;
import com.cg.onlinehotelmanagementsystem.utility.ValidHotelDetails;

public class HotelDetailsImpl implements IHotel {
	
	//This method is used for adding hotel details from admin point of view
	public void addHotelDetails(HotelDetails hotelDetails) throws HotelIdException, HotelNameException, HotelAddressException, NumberOfRoomException{
		int hotelId=hotelDetails.getHotelid();
		String hotelName=hotelDetails.getHotelname();
		String hotelAddress=hotelDetails.getHoteladdress();
		int noofRooms=hotelDetails.getNoofrooms();
		boolean idDetails= ValidHotelDetails.isValidHotelId(hotelId);
		boolean nameDetails= ValidHotelDetails.isValidHotelName(hotelName);
		boolean addressDetails=ValidHotelDetails .isValidHotelAddress(hotelAddress);
		boolean numOfRooms= ValidHotelDetails.isValidNumOfRoom(noofRooms);
		}

	//This method is used for adding hotel details from admin point of view
	public void viewHotelDetails(int hotelid) {
		HotelDetails hoteldetails = null;
		for(int i =0; i<=ListData.hotelList(hoteldetails).size(); i++) {
			System.out.println(ListData.hotelList(hoteldetails).get(i));
		}
		
	} 
		
	

   //This method is used for adding hotel details from admin point of view
	public void modifyHotelDetails(int hotelid) {
	
	
	}
   //This method is used for adding hotel details from admin point of view
	public void deleteHotelDetails(int hotelid) {
		
		
	}
	

}
