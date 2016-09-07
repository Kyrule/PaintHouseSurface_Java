package net.kip;
import java.util.Scanner;
/*
 * PAINT A HOUSE
 * Declare all variables
 * Ask for house length, width, height
 * Ask for number and size of windows.
 * Ask for number and size of doors.
 * Calculate total surface area to be painted
 * 
 * */

public class House {
	
	public static void main(String[] args){
			
		Scanner s=new Scanner(System.in);
		double houseLength=.0,houseWidth=.0,houseHeight=.0,widthWindow=.0,heightWindow=.0,
				totalAreaWindow=.0,totalAreaHouse=.0;
		int numberOfWindows=0;
		System.out.print("Please enter the house length: ");
		houseLength=s.nextDouble();
		System.out.print("Please enter the house width: ");
		houseWidth=s.nextDouble();
		System.out.print("Please enter the house height: ");
		houseHeight=s.nextDouble();
		System.out.print("Please enter the number of windows: ");
		numberOfWindows=s.nextInt();
		System.out.print("Please enter the width of windows: ");
		widthWindow=s.nextDouble();
		System.out.print("Please enter the height of windows: ");
		heightWindow=s.nextDouble();
		totalAreaWindow=widthWindow*heightWindow;
		totalAreaHouse=(houseWidth*houseHeight*2)+(houseLength*houseHeight*2);
		System.out.printf("Total surface area to be painted: %.3f",totalAreaHouse-totalAreaWindow);
		
	}

}
