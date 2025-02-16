package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Vehicle {
	
	
	public void applyBrake() {
		System.out.println("Brake Applied");

	}
	
	public static void main(String[] args) {
		Vehicle vehicleOptions=new Vehicle();
		vehicleOptions.applyBrake();
	
	}

}
