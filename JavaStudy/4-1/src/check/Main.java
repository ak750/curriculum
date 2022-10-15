package check;

import constants.*;

public class Main {
	private static final String firstName = "Sato";
	private static final String lastName = "Taro";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(firstName, lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotPet = new RobotPet( Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}
	
	private static void printName(String firstName, String lastName) {
		String name = firstName + lastName;
		System.out.println("printNameメソッド → " + name);
	}
}
