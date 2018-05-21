package Aaa;

//uow_w1626638
//2016212

import java.util.Arrays;

public class Queue{

	private int queueSize = 7;//variable to store queueSize which is 7
	private int front, numberOfItems, rear= 0;//initializing front, numberOfItems and rear to zero
	
	
	public void insert(String input){//add to the queue
		
		
		if(numberOfItems + 1 <= queueSize){//queue elements should not exceed queue size
			OOPHotelSystem.queueArray[rear] = input;//initializing queueArray array
			rear++;//increasing rear by one
			numberOfItems++;//increasing numberOfItems by one
		}
		else{
			System.out.println("Sorry, But the Queue is full and following queue will be deleted!!");//error message that shows queue array is full
			for(int i = 0; i < 7; i++){//printing queueArray
				System.out.println( (i+1) + "." + " " + OOPHotelSystem.queueArray[i]);
			}
			Arrays.fill(OOPHotelSystem.queueArray, "null");//
			numberOfItems = 0;
			rear = 0;
			front = 0;
			//bring back initial values again
		}
	}
	
	public void remove(){//remove from the queue
		if(numberOfItems > 0){
			System.out.println("First 3 customers in the queue are :-");
			for(int i = 0; i <3; i++){//printing first three elements in the array
				System.out.println( (i+1) + " " + OOPHotelSystem.queueArray[i]);
				OOPHotelSystem.queueArray[i] = "null";//make null the first three queue spaces
				front++;//increasing front by one
				numberOfItems--;//decreasing numberOfItems by one
			}
		}
		else{
			System.out.println("Sorry, the queue is Empty!!");//error message that shows queue is empty
		}
	}
}
