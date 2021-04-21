package org.howard.edu.assignment7.tollbooth;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.howard.edu.assignment7.tollbooth.FordTruck;
import org.howard.edu.assignment7.tollbooth.NissanTruck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.howard.edu.assignment7.tollbooth.DaewooTruck;
import org.howard.edu.assignment7.tollbooth.Toll;





	

public class TestTollBooth {
TollBooth booth = (TollBooth) new Toll();

public static void main(String [] args){
}
 
@Test
@DisplayName ("FordTruck test case")
public void FordTruck() {
	 Truck ford = new FordTruck(5, 12500);
	 booth.calculateToll(ford);
	 booth.displayData();
	 booth.reset();
	 assertEquals(booth.calculateToll(ford), 145);
 
 
 
 }

@Test
@DisplayName ("NissanTruck test case")
public void NissanTruck() {
	 Truck ford = new FordTruck(2, 5000);
	 booth.calculateToll(ford);
	 booth.displayData();
	 booth.reset();
	 assertEquals(booth.calculateToll(ford), 60);
 }

@Test
@DisplayName ("DaewooTruck test case")
public void DaewooTruck() {
	 Truck ford = new DaewooTruck(2, 5000);
	 booth.calculateToll(ford);
	 booth.displayData();
	 booth.reset();
	 assertEquals(booth.calculateToll(ford), 60);
}
}

