package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.dao.HotelDetails;
import com.cg.onlinehotelmanagementsystem.exception.HotelAddressException;
import com.cg.onlinehotelmanagementsystem.exception.HotelIdException;
import com.cg.onlinehotelmanagementsystem.exception.HotelNameException;
import com.cg.onlinehotelmanagementsystem.exception.NumberOfRoomException;

public interface IHotel {
	//addHotelDetails method adds hotel details to the database
    public void addHotelDetails(HotelDetails hotelDetailsEntity) throws HotelIdException, HotelNameException, HotelAddressException, NumberOfRoomException;
    
    //viewHotelDetails method views hotel details from the database
    public void viewHotelDetails(int hotelid);
    
    //modifyHotelDetails method modifies the hoteldetails based on the fields provided by admin 
    public void modifyHotelDetails(int hotelid);
    
    //deleteHotelDetails method deletes hotel details from the database
    public void deleteHotelDetails(int hotelid);

}
