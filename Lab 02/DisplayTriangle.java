import java.util.Scanner;
public class DisplayTriangle{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter n=") ;
		int n = keyboard.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<= 2*n; j++) {
				if(j>=n-1-i && j<=n-1+i) {
					System.out.print("*") ;
				}
				else {
					System.out.print(" ") ;
				}
			}
			System.out.print("\n") ;
		}
	}

}
