package codesoft;

import java.util.Scanner;

public class StudGradeCal {
	public static void main(String[] args)
	{
		int ML,CD,DE,GIS,CN;
		float total,percentage;
		//int marks;
		
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks of all subject : ");
		System.out.println("Enter marks of ML : ");
		ML=scan.nextInt();
		System.out.println("Enter the marks of CD : ");
		CD=scan.nextInt();
		System.out.println("Enter the marks of DE : ");
		DE=scan.nextInt();
		System.out.println("Enter the marks of GIS : ");
		GIS=scan.nextInt();
		System.out.println("Enter the marks of CN : ");
		CN=scan.nextInt();
		
		
		total=ML+CD+DE+GIS+CN;
		percentage=total/5;
		
		
		System.out.println("Total Marks are : "+total);
		System.out.println("Percentage is : "+percentage);
		
		if(percentage>=90){
			System.out.println("The Grade is : A+");
		}
		else if(percentage>=80){
			System.out.println("The Grade is : A");
		}
		else if(percentage>=70){
			System.out.println("The Grade is : B+");
		}
		else if(percentage>=50){
			System.out.println("The Grade is : B");
		}
		else if(percentage>=35){
			System.out.println("The Grade is : C");
		}
		else{
			System.out.println("Result is : Fail...");
		}
		
		
		
		
	}

}
