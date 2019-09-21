import java.util.Scanner;

public class Problem3 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int answer; //rating from user
		String continueResponse; //answer to continue question
		int totalPolitics = 0;
		int totalEnvironment = 0;
		int totalSpace = 0;
		int totalSecurity = 0;
		int totalMk = 0;
		int numUsers = 0;
		int maxPoints = 0;
		String maxTopic = "";
		int minPoints = 0;
		String minTopic = "";

		
		String[] topics = {"Politics", "Environment", "Space Exploration", "National Security", "Mortal Kombat"};
		int[][] responses = new int[5][10];
		
		do {
			System.out.println("Please rate the following based on interest from 1-10.\n");
			
			for(int i = 0; i <= 4; i++) {
				System.out.print(topics[i] + ": ");
				answer = scnr.nextInt();
				
				responses[i][answer - 1]++;	
			}
			numUsers++;
			
			System.out.println("Are there any more participants (y/n)? ");
			continueResponse = scnr.next();
			
		}while(!(continueResponse.equalsIgnoreCase("n")));
		scnr.close();
		
		//summing totals through 2D array
		
		for(int i = 0; i <= 4; i++) {
			for(int j =0; j <= 9; j++) {
				if(i == 0) {
					totalPolitics += (responses[i][j] * (j + 1));
				}
				else if(i == 1) {
					totalEnvironment += (responses[i][j] * (j + 1));
				}
				else if(i == 2) {
					totalSpace += (responses[i][j]) * (j + 1);
				}
				else if(i == 3) {
					totalSecurity += (responses[i][j]) * (j + 1);
				}
				else {
					totalMk += (responses[i][j]) * (j + 1);
				}
			}
		}
		
		
		System.out.println("\nThese are the responses:\n");
		
		//formatting chart below
		
		//above headers
		System.out.printf("%18s", "");
		for(int i = 1; i <= 10; i++) {
			System.out.printf(" %8d", i);
		}
		System.out.printf("%10s%n%n", "Averages");
		
		//printing data
		for(int i = 0; i <= 4; i++) {
			System.out.printf("%-18s", topics[i]);
			for(int j = 0; j <= 9; j++) {
				System.out.printf("|%8d", responses[i][j]);
			}
			
			if(i == 0) {
				System.out.printf("|%8.2f", (double)totalPolitics / numUsers);
			}
			else if(i == 1) {
				System.out.printf("|%8.2f", (double)totalEnvironment / numUsers);
			}
			else if(i == 2) {
				System.out.printf("|%8.2f", (double)totalSpace / numUsers);
			}
			else if(i == 3) {
				System.out.printf("|%8.2f", (double)totalSecurity / numUsers);
			}
			else {
				System.out.printf("|%8.2f", (double)totalMk / numUsers);
			}
			 
			System.out.print("|\n");
		}
		
		//Determine max
		int[] totals = {totalPolitics, totalEnvironment, totalSpace, totalSecurity, totalMk, -1};
		maxPoints = totals[0];
		minPoints = totals[0];
		
		for(int i = 0; i <= 4; i++) {
			if((totals[i + 1]) > (totals[i])) {
				maxPoints = totals[i + 1];
			}
		}
		for(int i = 0; i <= 4; i++) {
			if(totals[i] == maxPoints) {
				maxTopic = topics[i];
			}
		}
		
		for(int i = 0; i <= 4; i++) {
			if(((totals[i + 1]) < (totals[i])) && (totals[i + 1] == 0)) {
				minPoints = totals[i + 1];
			}
		}
		for(int i = 0; i <= 4; i++) {
			if(totals[i] == minPoints) {
				minTopic = topics[i];
			}
		}
		
		System.out.printf("%nThe topic with most points was %s with a total of %d points.%n", maxTopic, maxPoints);
		System.out.printf("%nThe topic with least points was %s with a total of %d points.%n", minTopic, minPoints);
		
	
	}
}
