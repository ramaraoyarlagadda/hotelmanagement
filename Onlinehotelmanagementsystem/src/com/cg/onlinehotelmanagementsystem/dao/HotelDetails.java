package com.cg.onlinehotelmanagementsystem.dao;



public class HotelDetails {
	int hotelid;
	String hotelname;
	String hoteladdress;
	@Override
	public String toString() {
		return "HotelDetails [hotelid=" + hotelid + ", hotelname=" + hotelname + ", hoteladdress=" + hoteladdress
				+ ", noofrooms=" + noofrooms + "]";
	}
	int noofrooms;
	 public HotelDetails() {
		
	}
	public HotelDetails(int hotelid, String hotelname, String hoteladdress, int noofrooms) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.hoteladdress = hoteladdress;
		this.noofrooms = noofrooms;
	}
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
	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}
	
		
		
		
	}
	


