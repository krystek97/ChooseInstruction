package instruction.sportcode.pl;

import java.util.Scanner;

public class SwitchInstruction 
{
	public static void main(String[] args)
	{
		int number ;
		Scanner reading = new Scanner(System.in) ;
		
		System.out.println("Podaj liczbe 1-3");
		number = reading.nextInt() ;
		switch(number)
		{
		    case 1:
		    	System.out.println("Podana liczba to jeden");
		    	break ; 
		    case 2:
		    	System.out.println("Podana liczba to dwa") ;
		    	break ; 
		    case 3:
		    	System.out.println("Podana liczba to 3");
		    	break ; 
		    default :
		    	System.out.println("Zostala podana nieprawidlowa wartosc");
		    	break ; 
		}
	}
}
