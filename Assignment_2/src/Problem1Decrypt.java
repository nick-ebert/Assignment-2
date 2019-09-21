import java.util.Scanner;

public class Problem1Decrypt {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
		System.out.print("Enter encrypted integer: ");
		userNum = scnr.nextInt();
		scnr.close();
		
		digit1 = userNum / 1000;
		digit2 = (userNum / 100) % 10;
		digit3 = (userNum % 100) / 10;
		digit4 = userNum % 10;
		
		int[] digits = {digit1, digit2, digit3, digit4};
		int[] newDigits = new int[4];
		
		for(int i = 0; i <= 3; i++) {
			if((digits[i] + 3) > 10) {
				newDigits[i] = (digits[i] + 3) - 10;
			}
			else {
				newDigits[i] = digits[i] + 3;
			}
		}
		
		System.out.printf("The decrypted integer is: %d%d%d%d", newDigits[2], newDigits[3], newDigits[0], newDigits[1]);
		
	}

}
