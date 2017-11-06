import java.util.Scanner;

public class WeekDays {
public static void main(String[]args){
	
	Scanner week=new Scanner (System.in);
	
	System.out.println("Enter week day's: ");
	
	int days;
	
	days=week.nextInt();
	
	if(days==7)
		System.out.println("It's Sunday");
	else if(days==6)
		System.out.println("It's Saturday");
	else if(days==5)
		System.out.println("It's Friday");
	else if(days==4)
		System.out.println("It's Thursday");
	else if(days==3)
		System.out.println("It's Wednesday");
	else if(days==2)
	System.out.println("It's Tuesday");
	else if(days==1)
		System.out.println("It's Monday");
	
	else
		System.out.println("Invalid entry");
}
}
