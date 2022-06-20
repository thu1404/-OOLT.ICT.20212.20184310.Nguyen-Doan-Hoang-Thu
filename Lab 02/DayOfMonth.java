import java.util.Scanner;

public class DayOfMonth {
	public static void LeapYear(int m, int y) {	
		switch(m) {
			case 1 : case 3: case 5:case 7: case 8:case 10: case 12: {
				System.out.println( m + "/" +y+ " has 31 days");
				break;
			}
			case 4 : case 6: case 9:case 11: {
				System.out.println( m + "/" +y+ " has 30 days");
				break;
			}
			case 2: {
				System.out.println( m + "/" +y+ " has 29 days");
				break;
			}
			default: break;
		}
	}
	
	public static void CommonYear(int m, int y) {
		switch(m) {
			case 1 : case 3: case 5:case 7: case 8:case 10: case 12: {
				System.out.println( m + "/" +y+ " has 31 days");
				break;
			}
			case 4 : case 6: case 9:case 11: { 
				System.out.println( m + "/" +y+ " has 30 days");
				break;
			}
			case 2: {
				System.out.println(m + "/" +y+ " has 28 days");
				break;
			}
			default: break;
		}
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	public static void main(String[] args) {
		int month = 0;
		int year = 0;
		int temp;
		Scanner keyboard= new Scanner(System.in);
		String[] abbs= { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec." }; 
		String[] months= { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }; 
		String[] in3letters= { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }; 

		do{
            temp =0;
            System.out.println("Enter the month: ");
			String n = keyboard.nextLine();

			if( isNumeric(n) ){
				month= Integer.parseInt(n);
			}
			for(int i=0; i< months.length; i++) {
				if( n.equals(months[i]) ){
					month=i+1;
				}
			}
			for(int i=0; i< abbs.length; i++) {
				if( n.equals(abbs[i]) ) {
					month=i+1;
				}
			}
			for(int i=0; i< in3letters.length; i++) {
				if(n.equals(in3letters[i])) {
					month=i+1;
				}
			}

			try {
				if(month > 12 || month < 0) {
					System.err.println("Invalid month");
                    temp=1;
				}
			}
			catch(NumberFormatException nfe) {
                temp=1;
				month=0;
        	}
			if(month==0) {
                System.err.println(" Invalid month");
                temp++;
            }
        } while(temp>0);
                
        do{
            temp=0;
			System.out.println("Enter the year: ") ;
			String y = keyboard.nextLine();
			if(y.length()!=4) { 
                System.err.println("Invalid year");
                temp=1;
            }
			else {
				try {
					year= Integer.parseInt(y);
				}
				catch(NumberFormatException nfe) {
					year =-1;
                    temp=1;
				}
                if(year < 0){
                    System.err.println("Invalid year");
                    temp=1;
                }
            }
        }while(temp>0);
                       
		if(  year%4 !=0 || year%100==0 && year%400 !=0 ) {
			CommonYear(month, year);
		}
		else {
			LeapYear(month, year);
		}		
		System.exit(0);
	}
}

