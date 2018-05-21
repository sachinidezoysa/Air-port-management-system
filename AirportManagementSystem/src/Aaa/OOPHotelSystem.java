package Aaa;

//uow_w1626638
//2016212

import java.io.IOException;
import java.util.Scanner;

public class OOPHotelSystem {

    static String[] hotel = new String[10];//creating a string array with 10 elements
    static String[] queueArray = new String[7];//creating a string array with 7 elements
    private static String continueChoice;//variable to store the continue choice value
    private static String choiceBackMain;//variable to store the back or main choice value
    private static boolean continueChoiceTF;//see line 42
    static Scanner input = new Scanner(System.in);
    private static Main_Menu objWelMain = new Main_Menu();//creating an object in Main_Menu Class
    private static Customer_Methods objWelCus = new Customer_Methods();//creating an object in Customer_Methods class
 
    
	public static void main(String[] args) throws IOException {
		for(int x = 0; x < 10; x++){//initializing the hotel array
			hotel[x] = "e";
		}
	 
		for(int x = 0; x < 7; x++){//initializing the queueArray array
			queueArray[x] = "null";
		}
	
        
    show_continueChoice();//call show_continueChoice() method
    show_choiceBackMain();//call show_choiceBackMain() method
    }
    
    
    private static void show_continueChoice() throws IOException{
        //Welcome note
		//main looping code
		do{
		System.out.println("*****************************************************");
		
		System.out.println("  		Welcome To Hotel Ganja  ");
		
		System.out.println("*****************************************************");
		System.out.println();
		
		continueChoiceTF = false;//this variable will be true if user type a letter other than C or c 
		
			do{//do while loop for first input validation
				System.out.print("To continue press C :- ");//asking to continue procedure
				continueChoice = input.nextLine();
				if(!(continueChoice.equals("C") || (continueChoice.equals("c")))){//checking input choice
					System.out.println("Please, Enter C or c on the given space");//warning message
					continueChoiceTF = true;
				}
			}while(continueChoiceTF == true);
			
		objWelCus.add_Customer_method();//calling add_Customer method using objWelAdd
		objWelCus.view_all_rooms();//calling view_All_Rooms method using obj1
			
		show_choiceBackMain();//calling prompt_B_M method
		}while(choiceBackMain.equals("B") || (choiceBackMain.equals("b")));	
		
		objWelMain.view_Main_Menu();//calling main_Menu method
	}
    
     static void show_choiceBackMain(){
        do{
		System.out.println("Press B to go back to the start of the page");
		System.out.println("Press M to go to the main menu");
		System.out.println();
		choiceBackMain = input.nextLine();
	}while(!(choiceBackMain.equals("B")||choiceBackMain.equals("b")||choiceBackMain.equals("m")||choiceBackMain.equals("M")));//input validation

	}
}
