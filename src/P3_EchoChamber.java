import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		
		
		System.out.print("What is your phrase?" );
		String phrase = console.nextLine();
		System.out.print("How many times should i repeat it?");
		int numberOfRepeats = console.nextInt();
		for (int i=0; i < numberOfRepeats; i++) {
			System.out.println(phrase);
		}

	}

}
