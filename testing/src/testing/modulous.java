package testing;

import java.util.Scanner;

public class modulous
	{
		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("I am going to quiz you on your modulus skills. Just enter the right number/answer when prompted.");
			String ok = userInput.nextLine();
			int bigNumber = (int)(Math.random()*11)+10;
			int litNum = (int)(Math.random()*1)+9;
			/*System.out.println("1.) " + bigNumber+ " % " + litNum);//1-8 first number larger
			
			System.out.println("2.) " + bigNumber+ " % " + litNum);
			System.out.println("3.) " + bigNumber+ " % " + litNum);
			System.out.println("4.) " + bigNumber+ " % " + litNum);
			System.out.println("5.) " + bigNumber+ " % " + litNum);
			System.out.println("6.) " + bigNumber+ " % " + litNum);
			System.out.println("7.) " + bigNumber+ " % " + litNum);
			System.out.println("8.) " + bigNumber+ " % " + litNum);
			System.out.println("9.) ");//both numbers equal
			System.out.println("10.) ");//second number larger
			*/
			for(int i=0; i<7; i++)
				{
					System.out.println(bigNumber+ " % " + litNum);
					int correct = (bigNumber%litNum);
					int answer =userInput.nextInt();
					if(answer == correct)
						{
						
						System.out.println("You got it right!");
						}
					else
						{
						System.out.println("That is wrong the correct answer is " +correct);
						}
				}
			}
	}