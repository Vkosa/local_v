package org.howard.edu.assignment7.tollbooth;
/**
 * This is a subclass of class track.
 * Defined getter method to define the axles and weight of a certain truck (Ford truck)
 * @author esther.lisanza
 *	
 */
public class DaewooTruck extends Truck {
	/**
	 * the constructor obtains and returns the axles and weight of a truck
	 * @param axles  (defined in truck class)
	 * @param weight (defined in truck class)
	 */
	public DaewooTruck(int axles, int weight) {

		this.axles = axles;
		this.weight = weight;
}
}
