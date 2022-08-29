/**
 * 
 */
package com.medavietest;

import java.util.Scanner;

/** Main Program for the Ceiling Fan application
 * @author Hina
 *
 */
public class ExerciseCF {

	/**
	 * @param args
	 */
	
	public static void printStatus(CelingFan fan) {
		System.out.println("Current Speed  " +fan.getSpeed() + " and is "+ fan.getDirection()  );
		
	}
	public static void main(String[] args) {
		
		CelingFan fan =new CelingFan();
		FanState state;
		
		printStatus(fan);
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter S to Change Speed  or D to Change direction");
		String input= scan.next();
		
		if(input.equalsIgnoreCase("S")) {
			state =new SpeedStateChange();
			fan =state.changeState(fan);
			printStatus(fan);
		}
		
		else if(input.equalsIgnoreCase("D")) {
			state= new DirectionStateChange();
			fan =state.changeState(fan);
			printStatus(fan);
			
		}
		else
			System.out.println("Please enter a valid Key S for Speed and D for Direction");
		}
	}

}
