package Week5;
import java.util.Scanner;

public class lab2b {
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
			
		//System.out.printf("The random number is: %d",computerNum );
		input.close();
	}
}

