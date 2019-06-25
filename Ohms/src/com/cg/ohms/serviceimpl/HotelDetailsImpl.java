package com.cg.ohms.serviceimpl;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.service.IHotel;
import com.cg.ohms.staticdb.HotelDetailsStaticDb;
import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;

public class HotelDetailsImpl implements IHotel {

	@Override
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws InValidHotelIdException,
			InValidHotelNameException, InValidHotelAddressException, InValidNumberOfRoomsException {
//		int hotelId=hotelDetailsEntity.getHotelId();
//		String hotelName=hotelDetailsEntity.getHotelName();
//		String hotelAddress=hotelDetailsEntity.getHotelAddress();
//		int noofRooms=hotelDetailsEntity.getNumOfRooms();

		
		return hotelDetailsEntity;
	}
	public int viewHotelDetails(int hotelId) {
		for(HotelDetailsDTO view : HotelDetailsStaticDb.getHotellist()) {
			System.out.println(view);
		}
		
		return 0;
	}
	public int modifyByHotelId(int hotelId) {
		
		return 0;
	}
	public int deleteHotelDetails(int hotelId) {
		
		return 0;
	}


}
