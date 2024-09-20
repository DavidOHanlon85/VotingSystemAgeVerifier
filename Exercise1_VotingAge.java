/**
 * 
 */
package slideDeckTasks;

import java.util.Scanner;

/**
 * 
 */
public class Exercise1_VotingAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare the variable
		
		int applicantsAge;
		
		// Prompt user
		
		System.out.println("What age are you?");

		// Instantiate the Scanner Object
		
		Scanner scanner = new Scanner(System.in);
		
		// Get applicant's age
		
		applicantsAge = scanner.nextInt();
		
		if(applicantsAge < 18) {
			System.out.println("You cannot vote.");
		}
		if (applicantsAge >= 18) {
			System.out.println("You can vote.");
		}
		scanner.close();
	}

}
