package passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class ThePasswordGenerator {

	public static void main(String[] args) {

		// welcome messages
			System.out.println("Welcome to Simple Password Generator!");
			System.out.println("Please enter the number of characters you'd like:");
			
			// scanner for input
			Scanner input = new Scanner(System.in);
			// enter an integer
			int digit = input.nextInt();
			
			// initialization of Strings for letters, upper / lower case, and special chars
			String lower_case = "abcdefghijklmnopqrstuvwxyz";
			String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String special_characters = "<>,.?/}]{]+_-)(*&^%$#@!=";
			
			// string to combine other strings
			String mix = lower_case + upper_case + numbers + special_characters;
			
			
			// array of chars for password, set to length given by user
			char[] password = new char[digit];
			
			// object r
			Random r = new Random();
			
			// loop up to desired length of password
			for (int i = 0; i < digit; i++)
			{
				//logic to generate random password
				password[i] = mix.charAt(r.nextInt(mix.length()));
			}
		
			System.out.println("We generated the following password for you:");
			System.out.println(password);

	}

}
