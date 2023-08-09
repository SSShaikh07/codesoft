package codesoft;
import java.util.Random;
import java.util.Scanner;
public class TaskOne 
{
	    public static void main(String[] args) 
	    {	        
	        Random rand = new Random();
	        int randomNumber = rand.nextInt(100);
	        boolean result = false;
	        int k = 4;
	        int k2 = 4;
	        System.out.println(randomNumber);

	        while(k>0)
	        {
	            @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
	            System.out.print("Guess the Number Between 1 to 100 : ");
	            int myNumber = sc.nextInt();

	            if(randomNumber == myNumber)
	            {
	                System.out.println("Congratulations!!! You guess the Right number & Number is : "+randomNumber);
	                result = true;
	                break;
	            } 
	            else if(randomNumber > myNumber)
	            {
	                System.out.println("You guess small number");
	                System.out.println();
	                k--;
	            }
	            else
	            {
	                System.out.println("You guess Large number");
	                System.out.println();
	                k--;
	            }
	        }

	        if(result == false)
	        {
	            System.out.println();
	            System.out.println("Sorry...!!! You lose the Game...");
	            System.out.println("You didn't guess the number in " + k2 + " Chances");
	            System.out.println("The Actual number is : " + randomNumber);
	        }

	    }	
}
