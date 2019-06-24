package com.cg.onlinehotelmanagementsystem.utility;

import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;

public class ValidHotelDetails {
	public static boolean isValidHotelId(int hotelId) throws HotelIdException
	{
		String hid=Integer.toString((hotelId));
		if(!(hid.matches("^[0-9]{2,5}$"))|| hid.isEmpty())
		{
			throw new HotelIdException("Enter valid hotelid of hotel");
		}
		return true;
	}
	public static boolean isValidHotelName(String hotelName) throws HotelNameException
	{
		if(!(hotelName.matches("^[a-zA-Z]{2,11}$")))
		{
			throw new HotelNameException("Enter valid Hotel name");
		}
		return true;
	}
	public static boolean isValidHotelAddress(String hotelAddress) throws HotelAddressException
	{
		if(!(hotelAddress.matches("^[A-Za-z]{2,16}$"))||hotelAddress.isEmpty())
		{
			throw new HotelAddressException("Enter valid Hotel Address");
		}
		return true;
	}
	public static boolean isValidNumOfRoom(int noOfRooms) throws NumberOfRoomException
	{
		String rooms=Integer.toString(noOfRooms);
		if(!(rooms.matches("[0-9]{1,3}"))||rooms.isEmpty()) {
			throw new NumberOfRoomException("Enter Valid Number For Rooms");
		}
		return true;
	}

}
