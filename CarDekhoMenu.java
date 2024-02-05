package com.jspiders.cardekho.Menu;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperations;

public class CarDekhoMenu {
	

	static boolean loop=true;
	
	public static void mainMenu() {
    CarOperations caroperations=new CarOperations();
    
    System.out.println("======MainMenu======\n"
    		 + "1. View all cars\n"
    		 + "2. Search cars\n"
    		 + "3. Add cars\n"
    		 + "4. Remove cars\n"
    		 + "5. Edit cars\n"
    		 + "6. Exit");
    
    Scanner scanner =new Scanner(System.in);
    int choice=scanner.nextInt();
    
    switch(choice) {
    case 1:
    	System.out.println("View all cars");
    	caroperations.viewAllcars();
    	break;
    	
    case 2:
    	System.out.println("======Search car======\n"
    			+ "1.Search by name\n"
    			+ "2.Search by brand\n"
    			+ "3.Search by fueltype\n"
    			+ "4.Search by price\n"
    			+ "5.Search by id\n"
    			+ "6.go back");
    	Scanner scanner1=new Scanner(System.in);
    	int choice1=scanner1.nextInt();
    	
    	switch(choice1) {
    	
    	case 1:
    		caroperations.byName();
    	break;
    	
    	case 2:
    		caroperations.byBrand();
    	break;
    	
    	case 3:
    		caroperations.byFuelType();
    	break;
    	case 4:
    		caroperations.byPrice();
    	break;
    	case 5:
    		caroperations.byId();
    	break;
    	case 6:
    		 mainMenu();
    	break;
    	default:
    		System.out.println("Exit");
    		loop=false;
    		break;
    	}
    	break;
    	
    	
    case 3:
    	caroperations.addcar();
    	System.out.println("Add car");
    	break;
    
    case 4:
    	caroperations.removeCar();
    	System.out.println("Remove car");
    	break;
    	
    case 5:
    	caroperations.editCarDetails();
    	System.out.println("car details are edited");
    	break;
    
    case 6:
    	System.out.println("thank you");
    	break;
    
    default :
    	System.out.println("Invalid number");
    	break;
    }
    
}
	
	public static void main(String[] args) {
		while(loop) {
			mainMenu();
		}
	}
}