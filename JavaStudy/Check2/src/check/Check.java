package check;

import constants.Constants;

public class Check {
	
	public static void main(String[] args) { 
		printName(firstName, lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robot.introduce();
	}
	
	private static String firstName = "Arai";
	private static String lastName = "Shunya";
	
	private static void printName(String a,String b) {
		System.out.println("printNameメソッド → " + a + b);
	}
	
	
	
}
