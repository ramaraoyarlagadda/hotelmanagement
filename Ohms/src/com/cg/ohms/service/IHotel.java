package com.cg.ohms.service;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;

public interface IHotel {
	
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws InValidHotelIdException,InValidHotelNameException,InValidHotelAddressException,InValidNumberOfRoomsException;
	public int deleteHotelDetails(int hotelId);
	public void viewHotelDetails();
	public int modifyByHotelName(int hotelId, String hotelName);
	public int modifyByHotelAddress(int hotelId, String hotelAddress);
	public int modifyByNumOfRooms(int hotelId,String numOfRooms);
	

}
