package com.cg.ohms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ohms.dto.HotelDetailsDTO;
import com.cg.ohms.exceptions.HotelException;
import com.cg.ohms.service.IHotelDetails;

@RestController
@RequestMapping(name = "/")
public class HotelController {
	/**
	 * here object of hoteldetails service is autowired
	 */

	@Autowired
	private IHotelDetails hotel;

	public void setHotel(IHotelDetails hotel) {
		this.hotel = hotel;
	}
/**
 * 
 * @param hotelDetailsDTO
 * @return hoteldetails based upon the hotelid provided
 */
	@RequestMapping(value = "/view", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public HotelDetailsDTO getHotelDetails(@RequestBody HotelDetailsDTO hotelDetailsDTO) {

		try {
			hotelDetailsDTO = hotel.viewHotelDetails(hotelDetailsDTO);
		} catch (HotelException e) {

			e.printStackTrace();
		}
		return hotelDetailsDTO;

	}
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value to notify either adding details is
	 * done correctly or not
	 */

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")

	public boolean addHotelDetails(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag = false;
		try {
			hotel.addHotelDetails(hotelDetailsDTO);
			flag = true;
		} catch (HotelException e) {

			e.printStackTrace();
		}
		return flag;

	}
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after modification of the name to updated entry
	 */

	@RequestMapping(value = "/modify/name", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public boolean modifyName(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag = false;
		try {
			hotel.modifyByHotelName(hotelDetailsDTO);
			flag = true;
		} catch (HotelException e) {

			e.printStackTrace();
		}

		return flag;

	}
/**
 * 
 * @param hotelDetailsDTO
 * @return boolean value after modification of the address to updated entry
 */
	@RequestMapping(value = "/modify/address", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public boolean modifyAddress(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag = false;
		try {
			flag = hotel.modifyByHotelAddress(hotelDetailsDTO);
		} catch (HotelException e) {

			e.printStackTrace();
		}

		return flag;

	}
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after modification of the rooms to updated entry
	 */

	@RequestMapping(value = "/modify/rooms", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public boolean modifyRooms(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag = false;
		try {
			hotel.modifyByNumOfRooms(hotelDetailsDTO);
			flag = true;
		} catch (HotelException e) {

			e.printStackTrace();
		}

		return flag;

	}
	/**
	 * 
	 * @param hotelDetailsDTO
	 * @return boolean value after deletion of details by particular id provided
	 */

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public boolean deleteHotel(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag = false;
		try {
			flag = hotel.deleteHotelDetails(hotelDetailsDTO);
		} catch (HotelException e) {

			e.printStackTrace();
		}

		return flag;

	}

}
