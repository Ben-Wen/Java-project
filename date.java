import java.util.Scanner;
/**
 * This is a program that reads a string from the keyboard and tests whether it contains a valid date.
 * @author wenjiawei
 * Homework 4 for Chapter 3.
 * Last Changed: June 4, 2019.
 */
public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the date in the form of dd mm yyyy, separated by a space.");
		int month,day,year;
		Scanner keyboard = new Scanner (System.in);
		
		month = keyboard.nextInt();
		day = keyboard.nextInt();
		year = keyboard.nextInt();
		
		boolean trueDay = true;
		boolean trueMonth = true;
		
		if ((month <= 1) && (month >= 12))
		
			trueMonth = false;
			
		else if ((month == 4)||(month == 6)||(month == 9)||(month == 11))
			 	
			 	   if ((day >= 1) && (day <= 30))
			 				trueDay = true;	
			 	   else	
			 				trueDay = false;
			 			
			 else if ((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12))
			 			
			 	   if((day >= 1)&&(day <= 31))
			 	   			trueDay = true;
			 	   else
			 	   			trueDay = false;
			 	   			
			 	   else if (month == 2)
							
							if ((year % 4 == 0)&&(year % 100 !=0)&&(year % 400 ==0))
								if ((day <= 29)&&(day>=1))
									trueDay = true;
								else
									trueDay = false;
							else if ((day <= 28)&&(day>=1))
									trueDay = true;
								 else   
									trueDay = false;
			 	        else
			 	        	trueMonth = false;
	    if ((trueDay)&&(trueMonth))
	    	System.out.println("The date you entered is " + month + "/" + day + "/" + year + ", which is valid.");
	    else if(!trueDay)	 		 
			System.out.println("The day you entered is not valid."); 	
	    	if(!trueMonth)
	    	System.out.println("The month you entered is not valid."); 
			
			
	}

}
