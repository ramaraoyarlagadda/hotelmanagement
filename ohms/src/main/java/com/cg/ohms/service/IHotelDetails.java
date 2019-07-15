package com.cg.ohms.service;

import com.cg.ohms.dto.HotelDetailsDTO;
import com.cg.ohms.exceptions.HotelException;

public interface IHotelDetails {
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after performing addition operation
	 * @throws HotelException
	 */

	public boolean addHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after performing deletion operation
	 * @throws HotelException
	 */

	public boolean deleteHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return hoteldetails for the particular id that we entered
	 * @throws HotelException
	 */
	public HotelDetailsDTO viewHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after performing updation of name in hoteldetails
	 * @throws HotelException
	 */

	public boolean modifyByHotelName(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after performing updation of address in hoteldetails
	 * @throws HotelException
	 */

	public boolean modifyByHotelAddress(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after performing updation of rooms in hoteldetails
	 * @throws HotelException
	 */

	public boolean modifyByNumOfRooms(HotelDetailsDTO hotelDetailsDTO) throws HotelException;
	
}
