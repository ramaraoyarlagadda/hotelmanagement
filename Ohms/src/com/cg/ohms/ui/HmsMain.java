package com.cg.ohms.ui;

import java.util.Scanner;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.service.IHotel;
import com.cg.ohms.service.impl.HotelDetailsImpl;
import com.cg.ohms.utility.ValidateHotelDetails;

public class HmsMain {
	
	
	
	public static void main(String[] args) {
		do {
		System.out.println("Hotel Management provides four operations for admin");
		System.out.println("1.Adding new hotel details\n2.View hotel details\n3.Modify hotel details\n4.Delete hotel details");
		System.out.println("Enter above mentioned number for performing that particular operation");
		Scanner scanner=new Scanner(System.in);
		String option=scanner.next();
		IHotel hotel=new HotelDetailsImpl();
		HotelDetailsDTO hotelDetailsEntity=new HotelDetailsDTO();
		ValidateHotelDetails validate=new ValidateHotelDetails();
			try {
				switch (option) {
				case "1":
					System.out.println("you entered option for adding hotel details");
					System.out.println("First for adding hotel you need to enter hotelid,hotelname,hoteladdress and numberofrooms");
					System.out.println("1.Enter HotelId for adding hotel");
					int hotelId=scanner.nextInt();
					validate.isValidHotelId(hotelId);
					System.out.println("2.Enter HotelName for adding hotel");
					String hotelName=scanner.next();
					validate.isValidHotelName(hotelName);
					System.out.println("3.Enter HotelAddress for adding hotel");
					String hotelAddress=scanner.next();
					validate.isValidHotelAddress(hotelAddress);
					System.out.println("4.Enter Number of Rooms for adding hotel");
					int numOfRooms=scanner.nextInt();
					validate.isValidNumberOfRooms(numOfRooms);
					hotelDetailsEntity.setHotelId(hotelId);
					hotelDetailsEntity.setHotelName(hotelName);
					hotelDetailsEntity.setHotelAddress(hotelAddress);
					hotelDetailsEntity.setNumOfRooms(numOfRooms);
			       HotelDetailsDTO hotelDetails=hotel.addHotelDetails(hotelDetailsEntity);
			        System.out.println("Hotel Details added successfully"+hotelDetails);
					break;
				case "2": 
					System.out.println("You Entered option for viewing hotel details");
//					System.out.println("Enter hotelid for viewing hotel details");
//					int id=scanner.nextInt();
					 hotel.viewHotelDetails();
					//System.out.println(hotelView);
					break;
				case "3":
					System.out.println("You Entered option for modifing hotel details");
					System.out.println("Enter your option for modifing");
					System.out.println("1.Modify HotelName\n2.Modify HotelAddress\n3.Modify NumberOfRooms");
					String choice=scanner.next();
					switch(choice) {
					case "1":
						System.out.println("Enter HotelId and HotelName for modification");
						int modifyId1=scanner.nextInt();
						String modifyName=scanner.next();
						
						break;
					case"2":
						System.out.println("Enter HotelId and HotelAddress for modification");
						int modifyId2=scanner.nextInt();
						String modifyAddress=scanner.next();
						break;
					case"3":
						System.out.println("Enter HotelId and Number of Rooms for modification");
						int modifyId3=scanner.nextInt();
						int modifyNumOfRooms=scanner.nextInt();
						break;
						default:
							System.err.println("Enter valid option for modification");
							break;
					}
					
					break;
				case "4":
					System.out.println("You Entered option for deleting hotel details");
					System.out.println("Enter hotelid for deleting hotel details");
					int deleteid=scanner.nextInt();
					int deletehotel=hotel.deleteHotelDetails(deleteid);
					System.out.println(deletehotel);

				default:
					System.err.println("Enter valid option for performing operations");
					break;
				}
			}
			catch (Exception e) {
				System.err.println("Error occured  "+e.getMessage());
			}
		
	}while(true);
	}
}
