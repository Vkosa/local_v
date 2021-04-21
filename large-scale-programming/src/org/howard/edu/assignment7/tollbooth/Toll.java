package org.howard.edu.assignment7.tollbooth;
/**
 * the class declares local variables and are able to keep track of the total number of receipts and trucks
 * implements methods that are defined in TollBooth interface
 * @author esther.lisanza
 *
 */
public class Toll implements TollBooth {
	
	int truck_count=0;
	int receipts = 0;
	int tollDue = 0;

/**
 * Calculates the toll and prints out the information. 
 * The information includes the axles, weight and total toll due.
 */
	public int calculateToll (Truck ford) {
		int axles=ford.axles;
		int weight=ford.weight;
		//tollDue= 5 * axles + (((weight/1000)/2)*10);
		tollDue= 5 * axles + (Math.floorDiv(weight,1000)*10);
		
		System.out.println ("Trucks axles: " + axles);
		System.out.println("Weight of truck: " + weight + "kg");
		truck_count++;
		receipts = receipts + tollDue;
		System.out.print("Toll Amount due for truck: " + tollDue + "\n");
		return tollDue;}
	
	/** 
	 * this method displays the data
	 */
	public void displayData() 
	{	
	//int calculator = receipts + tollDue;
	System.out.println("*** Collecting receipts  ***\n");
	System.out.println("Totals since the last Collection- Receipts: $" + receipts  + " Trucks: " + truck_count);	
	
	}
	
	/**
	 * resets the receipt and truck counter to zero
	 */
	public void reset()
	{
		displayData(); 
		receipts=0;
		truck_count=0;
	}

	
}
