package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;
import java.util.Collections;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println ("Index\tValue");
		int[] number= tabell;
		
		for (int i=0;i<number.length;i++) {
			System.out.println(i + "\t" + number[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
	
		int length = (tabell.length);

		String s = "";

		switch (length) {

		case 0:
			s = ("[" + "]");
			break;
			
		case 1:
			s = ("[" + tabell[0] + "]");
			break;

		case 3:
			s = ("[" + tabell[0]+ ","+ tabell[1]+"," + tabell[2] + "]");
			break;
		}

		return (s);
	
	}


		
	

	// c)
	public static int summer(int[] tabell) {

		
		int number[]= tabell;
		int sum = 0;
		
		
		for (int i : number) {
		    sum += i;
		}
	
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean result = false;
		
		for (int i=0;i<tabell.length;i++) {
			if (tabell[i] == tall) {
				result = true;
			}
	}
		return result;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i=0;i<tabell.length;i++) {
			if (tabell[i]==tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

	int tabrev[] = new int[tabell.length];
		
		int a = tabell.length;
		
		for (int i=0; i < tabell.length; i++) {
			tabrev[a -1] = tabell [i];
			a = a-1;
		}

		return tabrev;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int tabell2[] = new int[tabell.length];
		System.arraycopy(tabell, 0, tabell2, 0, tabell.length);
		boolean result = false;
		Arrays.sort(tabell2);
		
		if (tabell.length < 1){
			result = true;
		}
		else if (tabell[0] == tabell2[0]) {
			result = true;
		}
	
		return result;
	
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int a = tabell1.length;
		int b = tabell2.length;
		int result[]= new int [a + b];
		
		System.arraycopy(tabell1, 0, result, 0, a);
		System.arraycopy(tabell2, 0, result, a, b);
		
		Arrays.toString(result);
		
		return result;
	}
}
