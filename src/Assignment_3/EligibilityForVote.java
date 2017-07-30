package Assignment_3;


import java.util.Scanner;

public class EligibilityForVote {

	/*
	 * Creating a methods ageTest
	 */
	public void ageTest(int age) throws NotEligibleToVoteException {
	/*
	 * In here applying the try block
	 */
	try {
	/*
	 * In here applying if condition if the age of the voter is greater 
	 * than 18 then it is eligible to vote and if it is
	 * not then it is not eligible to vote. 
	 */
	if (age > 18) {

	System.out.println("eligible");

	} else {
	throw new NotEligibleToVoteException(age);
	}

}
	catch (Exception e) {

	System.out.println("Exeption " + e);
	}
	}

	/*
	 * In here we are creating the main method
	 */
	public static void main(String[] args)  {
	// TODO Auto-generated method stub
		/*
		 * taking input from the user as mentioned in question
		 */
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter voter age :");
	// Declaring variable age
	int voterAge = sc.nextInt();
	
	/*
	 * object of ageTest class
	 */
	EligibilityForVote efv = new EligibilityForVote();
	try{
	efv.ageTest(voterAge);
	}
	catch (NotEligibleToVoteException e){
	e.printStackTrace();
	e.toString();
	}
	}
	}

