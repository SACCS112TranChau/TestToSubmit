package Week5;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int computerNum = 0 + (int) ( Math.random() * 10 );
		
		System.out.print("Enter the number that you are guessing: ");
		int guessNumber = input.nextInt();
		if(guessNumber == computerNum)
			System.out.println("Matching!!!");
		if( computerNum  >  guessNumber)
			System.out.print("Too Large");
		if(computerNum  < guessNumber)
			System.out.print("Too Small");		
		
	}

}