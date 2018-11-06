package endava;

import java.util.Scanner;

//import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite proizvolji broj.");
		int a = ulaz.nextInt();
		System.out.println("Zatim unesite jos jedan proizvoljni broj.");
		int b = ulaz.nextInt();
		if (a<b) {
		System.out.println("Prvi broj je manji.");
			
		} else if (a>b)
				System.out.println("Prvi broj je veci.");
		
			else
				System.out.println("Brojevi su jednaki.");
		}
	}


