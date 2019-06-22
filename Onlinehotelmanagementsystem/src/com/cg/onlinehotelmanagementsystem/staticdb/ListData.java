package com.cg.onlinehotelmanagementsystem.staticdb;

import java.util.ArrayList;

import java.util.List;

import com.cg.onlinehotelmanagementsystem.dao.ACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.HotelDetails;
import com.cg.onlinehotelmanagementsystem.dao.KingRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.NonACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.QueenRoomDetails;

public class ListData {
	public static List<HotelDetails> hotellist=new ArrayList<HotelDetails>();
	public static List hotelList(HotelDetails hoteldetails)
	{
		hotellist.add(hoteldetails);
		return hotellist;
	}
	
}
