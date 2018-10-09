/* Program to compute even or odd number */
import java.util.Scanner;
public class Lab3OddEvenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		
		do
		{
			
		System.out .println("Please enter your name");
		Scanner scr1 = new Scanner(System.in);
		String name = scr1.nextLine();
		System.out.println(name + ": Enter the integer between 1 and 100");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		if(num<0 || num >100)// check if the number is between 1 and 100
		{
			System.exit(0);
		}
		if(num % 2 != 0)// check if the number is odd number
		{
			System.out.println(num +" Odd");
		}
		else if (num % 2 ==0 && num >=2 && num <=25)
		{
			System.out.println(" Even and less than 25");
			
		}
		else if (num % 2 ==0 && num >=26 && num <=60) // check if the number is in the range
		{                                             // of 26 to 60 and also check if it is even
			System.out.println(num + " Even");
		}
		else if (num % 2 == 0 && num>60)
		{
			System.out.println(num + "Even");
			
		}
		else if(num %2 !=0 && num >60)// check if the number is over 60 and odd 
		{
			System.out.println(num+ " Odd and over 60");
		}
		Scanner scr2= new Scanner(System.in);
		System.out.println("Continue? y / n ");// enter y or n for continue
		input= scr2.nextLine();
		
		}
		while(input.equals("y") || input.equals("Y"));
		System.out.println("Bye");
	}

}
