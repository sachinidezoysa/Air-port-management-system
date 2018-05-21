package Aaa;

//uow_w1626638
//2016212

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Customer_Methods extends Customer{//sub class of Customer class and super class of Main_Menu class

    private String choiceMoreAdd; //variable to store your choice add more new customer
    public static Queue objCusQ = new Queue();//creating an object in Queue class
    
    void add_Customer_method(){//add customer method
        do{
			do{
				System.out.print("Enter room number(0 - 9):- ");//prompt for enter room number
				setRoomNum(customerInput.nextInt());
				if(getRoomNum() >9){
					System.out.println(" Enter a room number between 0 - 9!!!");//validation for room number
				}
			}while(getRoomNum() > 9);
		System.out.println("Enter name for room " + getRoomNum() + " :");//prompt for enter customer name
        setRoomName(customerInput.next());//pass input to setRoomName method
        objCusQ.insert(getRoomName());//calling insert method in Queue class
	OOPHotelSystem.hotel[getRoomNum()] = getRoomName();//assigning room name to the array
			
	System.out.print("Do you want to add another customer then press Y otherwise N :- ");/*prompt for your choice
		                                                                               of adding more customers*/									
	choiceMoreAdd = customerInput.next();
	System.out.println();
	}while(choiceMoreAdd.equals("Y") || choiceMoreAdd.equals("y"));
	}
    
    
    
    
    
    void delete_customer_method(String [] b){//delete customer method
        
    System.out.print("Enter customer name :- ");//prompt for customer name
    setCustomerName(customerInput.nextLine());//passing input value to setCustomerName method
		
    for(int x = 0; x < 10; x++){//for loop for check all the rooms
    if(b[x].toLowerCase().equals(getCustomerName().toLowerCase())){//convert array element and customer name into lower case
	b[x] = "e";//replace e to hotel[x] element
	System.out.println("Room num " + x +" is now empty!");//Show that room is now empty 
    }
    }
    }
     
    
    
    
    
    
    void find_customer_method(String [] b){//find customer method
        
        System.out.print("Enter customer name :- ");//prompt for customer name
		setCustomerName(customerInput.nextLine());//passing input value to setCustomerName method
		
		for(int x = 0; x < 10; x++){//for loop for check all the rooms
			if(b[x].toLowerCase().equals(getCustomerName().toLowerCase())){//convert array element and customer name into lower case
				System.out.println("Mr./Mrs./Miss "+getCustomerName()+" is in the room " + x );//print the room details
			}
		}
    }
    
    
    
    
    
    
    
    void view_empty_rooms_method(String [] b){//view empty rooms method
        	for(int x = 0; x < 10; x++){//for loop to check all the rooms
			if(b[x].equals("e")){//check for an array element which is "e"
				System.out.println("room " + x + " is empty!");//print the empty rooms
			}
		}
    }
        
        
    
    
    
    
    void view_ordered_rooms(String [] b){//first sorting array
        	boolean finish = true; //determined when the sort is finished
        	String temp; //variable helps to sort number
		
	        String[] newHotel = new String[b.length];//new array
	 
	        //copy values from hotel[] to newHotel[]
	        for(int i =0;i < b.length;i++)
	            newHotel[i] = b[i];
		
	        while(finish){
	        	finish = false;
	        	for(int j = 0; j < newHotel.length-1; j++){
	        		if(newHotel[j].compareToIgnoreCase(newHotel[j+1]) >0){//comparing two letters
	        			temp = newHotel[j];
	        			newHotel[j] = newHotel[j+1];
	        			newHotel[j+1] = temp;
						//swapping two words
	        			finish  =  true;
	        		}
	        	}
	        }
	        sort_Order_Again(newHotel);//calling sort_Order_Again method
    }
    
    
    
    
    
    
    
    void sort_Order_Again(String [] c){//second sorting array
        
        //swapping original index
		for(int i = 0;i < 10; i++){
			for(int k= 0; k < 10; k++){
				if(c[i].equals(OOPHotelSystem.hotel[k]) && !(c[i].equals("e") && OOPHotelSystem.hotel[k].equals("e"))){
					System.out.println("Room " + k + "is occupied by " + c[i]);
				}
			}
		}
    }
    
    
    
    
    
    
    
    
    void view_all_rooms(){//view all rooms method
        for(int x = 0; x < 10; x++){
				System.out.println("room " + x + " occupied by " + OOPHotelSystem.hotel[x]);//view all rooms
		}
		System.out.println();
    

   
    }
   
    
    
    
    
    
    
       void store_Array(String [] b) throws IOException{//store data into a text file
        File as =  new File("Room_details.txt");//create a file object
		FileWriter asfw =  null;//create a file writer object
		PrintWriter aspw = null;//create a print writer object
		asfw =  new FileWriter(as,true);//auto flushing
		aspw =  new PrintWriter(asfw, true);//appending
		
		for(int i = 0; i < 10; i++){//for loop for check all the rooms
			if(b[i].equals("e")){//choose empty array elements
				aspw.write("Room " + i + " is empty!");
				aspw.println();
			}else{//choose occupied array element
				aspw.write("Room " + i  + " is occupied by "  + OOPHotelSystem.hotel[i]);
				aspw.println();
			}
		}
		aspw.close();//closing print writer object
		aspw.close();//closing file writer object
    }
    
       
       
       
       
       
       
    void load_Array(String[] b) throws IOException{//load data from text file
        	File searchFile = new File("Room_details.txt");//create search file object
		FileReader sfReader = new FileReader(searchFile);//create sfReader object
		BufferedReader reader = new BufferedReader(sfReader);//create bufferedReader object
		
		int i = 0;
		String str = null;//string variable for keep line by line from text file
		while((str= reader.readLine()) != null){//reads text file it has lines 
			b[i] = str;//assign str value to hotel[] 
			System.out.println(b[i]);//print i index of the array
			i++;//increments i by 1
		}
    }
}
