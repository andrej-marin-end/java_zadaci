package endava;
import java.util.Scanner;

public class Ispis_odAdoB {
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj:");
		int a = ulaz.nextInt();
		System.out.println("Unesite drugi broj:");
		int b = ulaz.nextInt();
				
		int c;
		c=a;
		do	 {	
			 if (c%2 == 0) 
				 System.out.print(c + ", ");
			 c++;
		}
			 while (c<=b);
		}
	}

	