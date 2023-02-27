/*
 * Class: CMSC203 
 * Instructor:Grigoriy Grinberg
 * Description: (The user has to guess in the random number generator)
 * Due: 02/27/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sebastian Black
*/
package RNG;
import java.util.Scanner;
public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int Guess=0, ToLow=0,ToHigh=0;
				String input = "yes";
				boolean bool=false;
				Scanner keyboard = new Scanner(System.in);
				while(input.equalsIgnoreCase("yes"))
				{
					ToLow=0;
					ToHigh=100;
					int Truenumber = RNG.rand();
					System.out.println("This application generates a random integer between 1 and 100 \nand asks the user to guess repeatedly until they guess correctly.");
					System.out.println("\nEnter the first guess:");
					Guess=keyboard.nextInt();
					
						if(Guess==Truenumber)
						{
							System.out.println("Congratulations, you guessed correctly");
						}
						else
						{
							while(true)
								{
									do
									{
										bool=RNG.inputValidation(Guess,ToLow,ToHigh);
										if(bool)
										{
											break;
										}
										Guess=keyboard.nextInt();
									}
									while(!bool);
									
									if(Guess>Truenumber)
									{
										ToHigh=Guess;
										System.out.println("Your guess is too high");
									}
									
									else if(Guess<Truenumber)
									{
										ToLow=Guess;
										System.out.println("Your guess is too low");
									}
									else
									{
										System.out.println("Congratulations, you guessed correctly");
										break;
									}
									RNG.incrementCount();
									System.out.println("Number of guesses is: "+RNG.getCount());													
									if(RNG.getCount()==7)
									{
										System.out.println("You have exceeded the maximum number of guesses, "+RNG.getCount()+". Try again");
										System.exit(0);
									}
									
									System.out.println("Enter your next guess between "+ToLow+" and "+ToHigh);
									Guess=keyboard.nextInt();
								}
						
						
						}
					System.out.println("Try again? (yes or no)");
					keyboard.nextLine();
					input=keyboard.nextLine();
					if(input.equalsIgnoreCase("yes"))
					{
						RNG.resetCount();
						
					}
					else
					{
						break;
					}
				    
				}
				
		          System.out.println("Programmer name: [Sebastian Black]");
	}

}
