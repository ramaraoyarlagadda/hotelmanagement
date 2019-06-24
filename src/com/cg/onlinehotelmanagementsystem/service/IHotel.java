package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.dao.HotelDetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;

public interface IHotel {
	/*addHotelDetails method adds hotel details to the database*/
    public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws HotelIdException, HotelNameException, HotelAddressException, NumberOfRoomException;
    
    /*viewHotelDetails method views hotel details from the database*/
    public void viewHotelDetails(int hotelid) throws HotelIdException;
    
    /*modifyHotelDetails method modifies the hoteldetails based on the fields provided by admin*/ 
    public void modifyHotelById(int hotelid) throws HotelIdException;
    
    /*deleteHotelDetails method deletes hotel details from the database*/
    public HotelDetailsDTO deleteHotelDetails(HotelDetailsDTO hoteldetails) throws HotelIdException;

}
