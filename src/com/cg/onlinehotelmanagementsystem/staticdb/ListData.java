package com.cg.onlinehotelmanagementsystem.staticdb;

import java.util.ArrayList;

import java.util.List;

import com.cg.onlinehotelmanagementsystem.dao.ACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.HotelDetailsDTO;
import com.cg.onlinehotelmanagementsystem.dao.KingRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.NonACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.QueenRoomDetails;

public class ListData {
	private static List<HotelDetailsDTO> hotellist=new ArrayList<HotelDetailsDTO>();
	public static List<HotelDetailsDTO> hotelList(HotelDetailsDTO hoteldetails)
	{
		hotellist.add(hoteldetails);
		hotellist.add(new HotelDetailsDTO(123,"royalpark", "Kakinada", 45));
		hotellist.add(new HotelDetailsDTO(23425, "Taj hotel","Hyderabad" , 455));
		return hotellist;
	}
	public static List<HotelDetailsDTO> getHotellist() {
		return hotellist;
	}
	public static void setHotellist(List<HotelDetailsDTO> hotellist) {
		ListData.hotellist = hotellist;
	}
	
}
