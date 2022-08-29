/**
 * 
 */
package com.medavietest;

/** Component for the Ceiling Fan features-Setters and Getters for Ceiling Fan features.
 * Any extra features could be added in the future
 * @author Hina
 *
 */
public class CelingFan {
	
	public enum DIRECTION{
		CLOCKWISE, ANTICLOCKWISE;
	};
	
	private int speed;
	private DIRECTION direction;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public DIRECTION getDirection() {
		return direction;
	}
	public void setDirection(DIRECTION direction) {
		this.direction = direction;
	}
	
	public CelingFan()
	{
		speed=0;
		direction = DIRECTION.CLOCKWISE;
	}
	

}
