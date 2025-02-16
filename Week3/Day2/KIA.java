package week3.day2;

public class KIA extends Car {
	
	
	public void SeaterFacility() {
		System.out.println("8 Seater");

	}
	
	

	public static void main(String[] args) {
		KIA kiaOptions=new KIA();
		kiaOptions.advancedBrake();
		kiaOptions.applyBrake();
		kiaOptions.SeaterFacility();

	}

}


//KIA    extends    Car     extends    Vehicle
//GrandChild      Parent               GrandParent