package com.cg.ohms.service.impl;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;
import com.cg.ohms.service.IHotel;
import com.cg.ohms.staticdb.HotelDetailsStaticDb;

public class HotelDetailsImpl implements IHotel {
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws InValidHotelIdException,
	InValidHotelNameException, InValidHotelAddressException, InValidNumberOfRoomsException {
    //int hotelId=hotelDetailsEntity.getHotelId();
    //String hotelName=hotelDetailsEntity.getHotelName();
    //String hotelAddress=hotelDetailsEntity.getHotelAddress();
    //int noofRooms=hotelDetailsEntity.getNumOfRooms();


    return hotelDetailsEntity;
   }
    public HotelDetailsDTO viewHotelDetails() {
    for(HotelDetailsDTO view : HotelDetailsStaticDb.getHotellist()) {
	System.out.println(view);
    }
    return ;
    }
    public int deleteHotelDetails(int hotelId) {

     return 0;
      }
	@Override
	public int modifyByHotelName(int hotelId, String hotelName) {
		
		return 0;
	}
	@Override
	public int modifyByHotelAddress(int hotelId, String hotelAddress) {
		
		return 0;
	}
	@Override
	public int modifyByNumOfRooms(int hotelId, String numOfRooms) {
		
		return 0;
	}


}
