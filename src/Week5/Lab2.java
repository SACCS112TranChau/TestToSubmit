package Week5;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int computerNum = 0 + (int) ( Math.random() * 10 );
		
		System.out.print("Enter the number that you are guessing: ");
		int guessNumber = input.nextInt();
		if(guessNumber == computerNum)
		{
			System.out.println("Matching!!!");
		}
		else
		{
			System.out.printf("The numbers you type is %d. \nThe computer number is %d", guessNumber, computerNum);
		}
		if(computerNum > computerNum)
		{
			System.out.println("\nToo Large");
		}
		else 
		{
			System.out.println("\nToo Small");
		}
		//System.out.printf(" The random number is %d ",computerNum );
		input.close();
	}
}
