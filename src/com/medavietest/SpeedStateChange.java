/**
 * 
 */
package com.medavietest;

/** Implementation to change speed behavior
 * @author Hina
 *
 */
public class SpeedStateChange implements FanState {

	@Override
	public CelingFan changeState(CelingFan celingFan) {
		
		int speed =celingFan.getSpeed();
		speed =(int) ((speed > 2 )? 0 : ++speed);
		celingFan.setSpeed(speed);
		return celingFan;
	
	}
}
