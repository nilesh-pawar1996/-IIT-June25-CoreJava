import java.util.Calendar;
import java.util.Scanner;



class Date{
	private int day;  
	private int month; 
	private int year;  
	
	public Date( ) {
		System.out.println("public Date( )");
		Calendar c = Calendar.getInstance(); 
		this.day = c.get(Calendar.DATE); 
		this.month = c.get(Calendar.MONTH) + 1; 
		this.year = c.get(Calendar.YEAR); 
	}
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Day : ");
		day = sc.nextInt(); 
		System.out.print("Month : ");
		month = sc.nextInt(); 
		System.out.print("Year : ");
		year = sc.nextInt(); 
	}
	//this = dt1
	public void printRecord( ) {
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
	}
	
}
public class Program {
	
	public static void main(String[] args) {
		Date dt1 = new Date(); 
		dt1.printRecord();
	}
	/* 
	public static void main1(String[] args) {
		Date dt1 = new Date();  
		Date dt2 = dt1; 
		dt1.printRecord();
		dt2.printRecord();
		
	}*/ 

}
