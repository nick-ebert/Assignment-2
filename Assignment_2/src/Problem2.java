import java.util.Scanner;

public class Problem2 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		double BMI = 0.0;
		int select;
		int userWeight = 0;
		double userHeight = 0;
		
		System.out.print("Enter 1 for metric units or 2 for  US Customary units: ");
		select = scnr.nextInt();
		
		
		if(select == 1) {
			System.out.print("Enter weight in kilograms: ");
			userWeight = scnr.nextInt();
			
			System.out.print("Enter height in meters: ");
			userHeight = scnr.nextDouble();
			
			BMI = userWeight / (Math.pow(userHeight, 2));
		}
		else if(select == 2){
			System.out.print("Enter weight in pounds: ");
			userWeight = scnr.nextInt();
			
			System.out.print("Enter height in inches: ");
			userHeight = scnr.nextDouble();
			
			BMI = 703 * userWeight / (Math.pow(userHeight, 2));
		}
		else {
			System.out.print("\nInvalid input.");
		}
		
		scnr.close();
		
		
		if(BMI < 18.5) {
			System.out.printf("%nBMI is %.2f. You are considered underweight.%n", BMI);
		}
		else if((BMI >= 18.5) && (BMI < 25)) {
			System.out.printf("%nBMI is %.2f. You are considered normal weight.%n", BMI);
		}
		else if((BMI >= 25) && (BMI < 30)) {
			System.out.printf("%nBMI is %.2f. You are considered overweight.%n", BMI);
		}
		else {
			System.out.printf("%nBMI is %.2f. You are considered obese.%n", BMI);
		}
		
	}

}
