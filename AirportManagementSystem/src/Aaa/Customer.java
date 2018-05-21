package Aaa;

//uow_w1626638
//2016212

import java.util.Scanner;

public class Customer {//Super class of Customer_Methods class

	    private int roomNum;//variable to store roomNum
	    private String roomName;//variable to store roomName
	    private String customerName;//variable to store customerName
	    Scanner customerInput = new Scanner(System.in);//creating scanner object
	    public OOPHotelSystem objCusWel = new OOPHotelSystem();//creating an object in OOPHotelSystem class, public - because of sub classes

	    
	    public int getRoomNum() {//get method for roomNum
		return roomNum;
	    }

	    
	    public void setRoomNum(int roomNum) {//set method for roomNum
		this.roomNum = roomNum;
	    }

	    
	    public String getCustomerName() {//get method for customerName
		return customerName;
	    }

	    
	    public void setCustomerName(String customerName) {//set method for customerName
		this.customerName = customerName;
	    }
	    
	    
	    public String getRoomName(){//get method for roomName
	        return roomName;
	    }
	    
	    
	    public void setRoomName(String roomName){//set method for roomName
	        this.roomName = roomName; 
	    }
}
