package SommaArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SommaArray {

	public static void main(String[] args) {
		
		/*
		 * Creare un array di 10 numeri da tastiera.
			Dire se è maggiore la somma degli elementi di posto pari, oppure la somma degli elementi di posto dispari.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeri = new int[10];
		
		int sommaIndiciPari = 0;
		int sommaIndiciDispari = 0;
		
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("inserisci un numero");
			numeri[i] = scanner.nextInt();
			if(i % 2 == 0) {
				sommaIndiciPari += numeri[i];
			}else {
				sommaIndiciDispari += numeri[i];
			}
		}
		
		System.out.println(Arrays.toString(numeri));
		
		if(sommaIndiciPari > sommaIndiciPari) {
			System.out.println("la somma delle posizioni pari è maggiore e vale "+sommaIndiciPari);
		}else {
			System.out.println("la somma delle posizioni dispari è maggiore e vale "+sommaIndiciDispari);
		}
		
		scanner.close();

	}

}
