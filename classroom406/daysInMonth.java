package classroom406;

import java.util.Scanner;

public class daysInMonth {
	public static void main (String[] args){
		System.out.println("Enter a number between 1 and 12: ");
		Scanner scannerInput=new Scanner(System.in);
		 while (!scannerInput.hasNextInt())  {
			 System.out.println("Enter a number between 1 and 12: ");
			 scannerInput=new Scanner(System.in);
		 }

		int randomNumber = scannerInput.nextInt();
		if(randomNumber==1){
			System.out.println("The number of days in month" + randomNumber+" is 31");
		}else if (randomNumber==2){
			System.out.println("The number of days in month "+ randomNumber+" is 28");
		}else if (randomNumber==3){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber ==4){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==5) {
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if(randomNumber ==6){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==7){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber==8){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber==9){ 
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==10){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber ==11){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==12){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else {
			System.out.println("Please enter a number between 1 and 12");
		}
				
		 	
	}
}
