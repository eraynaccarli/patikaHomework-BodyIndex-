import java.util.Scanner;

public class Main {

	
	public static double calculate(double height, double weight) {
		
		return  weight / (height * height);
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your height: ");
		String heightInput = sc.nextLine();
		double heightParse = Double.parseDouble(heightInput);
		
		System.out.println("Please enter your weight: ");
		double weightInput = sc.nextDouble(); // bir daha veri girisi yapmayacigim icin parse etmedim
		
		
		System.out.println("Your Body Index: " + calculate(heightParse, weightInput));
		
		
	}
	

}
