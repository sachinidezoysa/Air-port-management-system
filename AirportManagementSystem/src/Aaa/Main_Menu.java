package Aaa;

//uow_w1626638
//2016212

import java.io.IOException;
import java.util.Scanner;

public class Main_Menu extends Customer_Methods{

	private Scanner inputMain = new Scanner(System.in);//creating scanner object
	private Customer_Methods objMainCus = new Customer_Methods();//creating an object in Customer_Methods class
    
    void view_Main_Menu() throws IOException{
        
        	//Prompt for Main Menu
		System.out.println("--------------------------");
		System.out.println("  Welcome To HotelSeafresh ");
		System.out.println("--------------------------");
		System.out.println();
		System.out.println(" E : Display Empty rooms");
		System.out.println(" D : Delete customer from room");
		System.out.println(" F : Find room from customer name");
		System.out.println(" S : Store program array data into a plain text file");
		System.out.println(" L : Load program data back from the file into the array");
		System.out.println(" O : View rooms ordered alphabetically by name");
		System.out.println(" A : Add new customer");
		System.out.println(" V : View all the rooms");
		System.out.println();
		
		String menuOption = inputMain.next();//variable to store main menu option//initializing it
		
		if (menuOption.trim().equalsIgnoreCase("E")){
			objMainCus.view_empty_rooms_method(OOPHotelSystem.hotel);//calling view_Empty_Rooms()
		}
		else if (menuOption.trim().equalsIgnoreCase("D")){
			objMainCus.delete_customer_method(OOPHotelSystem.hotel);//calling delete_Customer()
		}
		else if (menuOption.trim().equalsIgnoreCase("F")){
			objMainCus.find_customer_method(OOPHotelSystem.hotel);//calling find_Room()
		}
		else if (menuOption.trim().equalsIgnoreCase("S")){
			objMainCus.store_Array(OOPHotelSystem.hotel);//calling store_Array()
		}
		else if (menuOption.trim().equalsIgnoreCase("L")){
			objMainCus.load_Array(OOPHotelSystem.hotel);//calling load_Array()
		}
		else if (menuOption.trim().equalsIgnoreCase("O")){
			objMainCus.view_ordered_rooms(OOPHotelSystem.hotel);//calling sort_Order()
		}
		else if (menuOption.trim().equalsIgnoreCase("A")){
			objMainCus.add_Customer_method();//callingadd_Customer()
		}
		else if (menuOption.trim().equalsIgnoreCase("V")){
			objMainCus.view_all_rooms();//calling view_All_Rooms()
		}
		else{
			System.out.println("Invalid input!!");//invalid input error message
		}
		
		view_Main_Menu();//repeating main method
    }
}
