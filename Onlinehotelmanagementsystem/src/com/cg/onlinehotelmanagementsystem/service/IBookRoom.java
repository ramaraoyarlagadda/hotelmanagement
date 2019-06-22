package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.exception.NoRoomAvailable;
import com.cg.onlinehotelmanagementsystem.exception.PersonExceedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomAlreadyBookedException;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;

public interface IBookRoom {
double bookRoom(int roomtype,ListData listdata,int numberperson)throws PersonExceedException,RoomAlreadyBookedException,NoRoomAvailable;
//void cancelRoom(int id);
}
