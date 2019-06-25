package com.cg.ohms.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.ohms.dao.HotelDetailsDTO;

public class HotelDetailsStaticDb {
private static List<HotelDetailsDTO> hotellist=new ArrayList<HotelDetailsDTO>();

public static List<HotelDetailsDTO> getHotellist() {
	return hotellist;
}
public static HotelDetailsDTO  hotellist(HotelDetailsDTO hotelDetailsDTO) {
	hotellist.add(hotelDetailsDTO);
	hotellist.add(new HotelDetailsDTO(1234, "royalpark", "kakinada", 50));
	hotellist.add(new HotelDetailsDTO(7896, "HotelGrand", "Hyderabad", 150));
	return hotelDetailsDTO;
}


}
