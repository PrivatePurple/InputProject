package Controller;

import java.util.Scanner;

public class inputController
{
	public void start()
	{
		System.out.println("Starting up GLaDOS.exe . . .");
		// Leave it to me to have my own program sass me at every turn.
		System.out.println("GLaDOS.exe started successfully.");
		System.out.println("Please answer the following questions:");
	
		questions();
		
		moreInput();
	}
	
	
	private void questions()
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		System.out.println(answer+", huh, that's a color I didn't anyone would like. Guess you're special. Good for you.");	
	
		System.out.println("What is your favorite Season?");
		answer = inputScanner.nextLine();
		System.out.println(answer+", huh. In my test chambers underground, there are no seasons.");	
		
		System.out.println("What is the best kind of Cookie?");
		answer = inputScanner.nextLine();
		System.out.println(answer+" hmm... I prefer a nice Black Forrest Cake. Maybe once I'm done testing I'll make some.");
		
		System.out.println("Rock, Paper, Scissors!");
		answer = inputScanner.next();
		System.out.println(answer+", well HA! I chose a black hole! That black hole just consumes your "+ answer+"! I WIN!");
		
		System.out.println("What's your favorite game?");
		answer = inputScanner.next();
		System.out.println(answer+" is a pretty nice game. But I prefer the game of 'How many tests can a human solve before they die?'");
	
//		inputScanner.close();
		//Closed because the InputSream from the keyboard is still in use
		
	}
	
	private void moreInput()
	{
		Scanner textScanner; //This is a declaration of a Scanner variable. 
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		
		
		System.out.println("Type your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " + userNumber);
	
		
		//Need to call .nextLine() to consume the enter press after the call to .next, .nextInt, or .nextDouble.
		textScanner.close();
		
		
	}

	public boolean validInt(String sample)
	
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
			catch(NumberFormatException error)
		{
				System.out.println("Hey, you forgot to put in a number!");
		}
				return isValid;
	}
	
	public boolean validDouble(String example)
			{
		//Declares and initializes a boolean variable as false.
				boolean isValid = false;
			
			try
			{ 
				//Tries to convert the text to an integer
				Double.parseDouble(example);
				isValid = true;
			}
			catch (NumberFormatException oops)
			{
				System.out.println("Uh oh, ya freakin moron, you just got BEANED!");
			}
			return true;
	
		}
}