/**
 * 
 */
package com.medavietest;

import com.medavietest.CelingFan.DIRECTION;

/** Implementation to change direction behavior
 * @author Hina
 *
 */
public class DirectionStateChange implements FanState {

	@Override
	public CelingFan changeState(CelingFan celingFan) {
		
		DIRECTION direction = (celingFan.getDirection().equals(DIRECTION.CLOCKWISE)) ? DIRECTION.ANTICLOCKWISE:DIRECTION.CLOCKWISE;
		celingFan.setDirection(direction);
		return celingFan;
	}

}
