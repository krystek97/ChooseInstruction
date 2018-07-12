package instruction.sportcode.pl;

import java.util.Scanner;

public class Ifintruction 
{
	public static void main(String[] args)
	{
		int number ;
		Scanner reading = new Scanner(System.in) ;
		
		System.out.println("Podaj dowolna liczbe");
		number = reading.nextInt() ;
		if(number>0)
		{
			System.out.println("Podana zostala liczba wieksza od zera");
		}
		else
		{
			System.out.println("Podana zostala liczba mniejsza od zera");
		}
	}
}
