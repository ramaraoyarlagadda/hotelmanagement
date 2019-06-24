package com.cg.onlinehotelmanagementsystem.serviceimpl;

import java.util.Iterator;
import java.util.List;

import com.cg.onlinehotelmanagementsystem.dao.HotelDetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;
import com.cg.onlinehotelmanagementsystem.service.IHotel;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;
import com.cg.onlinehotelmanagementsystem.utility.ValidHotelDetails;

public class HotelDetailsImpl implements IHotel {
	
	/*This method is used for adding hotel details from admin point of view*/
	HotelDetailsDTO hotel=null;
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hoteldetails) throws HotelIdException, HotelNameException, HotelAddressException, NumberOfRoomException{
		int hotelId=hoteldetails.getHotelid();
		String hotelName=hoteldetails.getHotelname();
		String hotelAddress=hoteldetails.getHoteladdress();
		int noofRooms=hoteldetails.getNoofrooms();

		return hoteldetails;
		}

	/*This method is used for adding hotel details from admin point of view*/
	public void viewHotelDetails(int hotelId) throws HotelIdException {
//		System.out.println(ListData.hotelList(hoteldetails).contains(hoteldetails));
//		for(int i =0; i<=ListData.hotelList(hoteldetails).size(); i++) {
//			hotel=(HotelDetailsDTO)ListData.hotelList(hoteldetails).get(i);
//			System.out.println(hotel.getHotelname());
//			System.out.println(hotel.getHoteladdress());
//			System.exit(1);
//		}
		for(HotelDetailsDTO view: ListData.hotellist.)
		{
			System.out.println(view);
		}
		
		
	} 
   /*This method is used for adding hotel details from admin point of view*/
	public void modifyHotelById(int hotelid) throws HotelIdException {
		
		
		
	
	
	}
   //This method is used for adding hotel details from admin point of view
	public HotelDetailsDTO deleteHotelDetails(HotelDetailsDTO hoteldetails) throws HotelIdException {
		/*for(int i =0; i<=ListData.hotelList(hoteldetails).size(); i++) {
			hotel=(HotelDetailsDTO) ListData.hotelList(hoteldetails).remove(i);
		System.out.println("Hotel details deleted successfully");
    	System.exit(0);
		}*/
		
		return hoteldetails;
		
		
	}
	

}
