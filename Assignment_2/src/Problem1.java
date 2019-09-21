import java.util.Scanner;

public class Problem1 { //encryption
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
		int new1; //new digits after adding 7 then % 10 to each
		int new2;
		int new3;
		int new4;
		
		System.out.print("Enter 4 digit integer: ");
		userNum = scnr.nextInt();
		scnr.close();
		
		digit1 = userNum / 1000;
		digit2 = (userNum / 100) % 10;
		digit3 = (userNum % 100) / 10;
		digit4 = userNum % 10;
		
		new1 = (digit1 + 7) % 10; //this expression results in digit minus 3
		new2 = (digit2 + 7) % 10; //relevant for decryption 
		new3 = (digit3 + 7) % 10;
		new4 = (digit4 + 7) % 10;
		
		System.out.printf("The encrypted number is: %d%d%d%d", new3, new4, new1, new2);
		
		
	}

}
