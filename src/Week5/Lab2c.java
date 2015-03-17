package Week5;
import java.util.Scanner;

public class Lab2c {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int computerNum = 0 + (int) ( Math.random() * 10 );
		
		System.out.print("Enter the number from 1-10: ");
		int guessNumber = input.nextInt();
		if((guessNumber <= 0 ) || (guessNumber >= 10))
		{
			System.out.println("The number you enter is larger than 10");
		}
		else
		{
			if((guessNumber == computerNum ) )
				System.out.println("Matching!!!");
			else if(computerNum > guessNumber)
				System.out.println("Too Small");
			else if(computerNum < guessNumber)
				System.out.println("Too Large");
		}
			
		System.out.print("Do you want to play again? Please enter Y for yes and N for no: ");
		String answerYesNo = input.next();
		answerYesNo.toUpperCase();
		if(answerYesNo.equals("y"))
		{
			System.out.println("Rerun the program!");
		}
		else if(answerYesNo.equals("n"))
			System.out.println("Thanks for playing");
		//System.out.printf("The random number is: %d",computerNum );
		input.close();
	}
}
