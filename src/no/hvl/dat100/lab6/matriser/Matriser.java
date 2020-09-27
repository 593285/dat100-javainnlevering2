package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] row : matrise) {
			  

            for (int x : row) {
                System.out.print(x + " "); 
            }
		}
		 
}
	// b)
	public static String tilStreng(int[][] matrise) {

		String s = (Arrays.toString(matrise [0]) + " \n" + Arrays.toString(matrise[1]) + " \n" + Arrays.toString(matrise[2]) + " \n").replace("[","").replace(",","").replace("]","");
        return s;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int result[][] = new int[matrise.length][matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
            for (int y = 0; y < matrise.length; y++) {
            	result[i][y] = (matrise[i][y]*tall);
            	
            }
		}
		return result;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean result = false;
		
		for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < a.length; y++) {
            	if (a[i][y] == b[i][y]) {
            		result = true;
            	}
            		else if (a[i][y] < b[i][y]) {
            			result = false;
            		}
            		else if (b[i][y] < a[i][y]) {
            			result = false;
            		}
            }
		}
		return result;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
