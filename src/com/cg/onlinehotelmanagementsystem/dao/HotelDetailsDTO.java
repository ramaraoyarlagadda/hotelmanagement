package com.cg.onlinehotelmanagementsystem.dao;

/*HotelDetails is Entity class for hoteldetails like
 *  hotelid,hotelname,hoteladdress and numberofrooms
 */

public class HotelDetailsDTO {
	int hotelid;
	String hotelname;
	String hoteladdress;
	int noofrooms;
	@Override
	public String toString() {
		return "HotelDetails [hotelid=" + hotelid + ", hotelname=" + hotelname + ", hoteladdress=" + hoteladdress
				+ ", noofrooms=" + noofrooms + "]";
	}
	/*constructor for hoteldetails*/
	 public HotelDetailsDTO() {
		
	}
	 /* parametarized constructor for hoteldetails*/
	public HotelDetailsDTO(int hotelid, String hotelname, String hoteladdress, int noofrooms) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.hoteladdress = hoteladdress;
		this.noofrooms = noofrooms;
	}
	/* Below are getter and setter methods for above mentioned variables of hoteldetails class*/
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public int getNoofrooms() {
		return noofrooms;
	}
	public void setNoofrooms(int rooms) {
		this.noofrooms = rooms;
	}
	
		
		
		
	}
	


