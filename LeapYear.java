import java.util.*;
public class LeapYear {

	/**
	 A Java program to find out whether a year is a leap year or not
	 */
	public static void main(String[] args) {
		Scanner mySc = new Scanner(System.in);
		while (true) {
			System.out.println("What is the year?: ");
			int myYear = mySc.nextInt();
			boolean isIt = leapYear(myYear);
			if ( isIt == true) {
				System.out.println(myYear +" is a leap year\n");
			} else {
				System.out.println(myYear +" is not a leap year\n");
			}
		}		
	}
	
	//Function to find out leap year
	public static boolean leapYear(int yr) {
		if((yr%4==0)&& (yr%100!=0)) return true;
		else if ((yr%4==0)&&(yr%100==0) && (yr%400==0)) return true;
		else return false;
	}
}
