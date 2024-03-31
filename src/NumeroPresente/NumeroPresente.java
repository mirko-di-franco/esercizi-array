package NumeroPresente;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumeroPresente {

	public static void main(String[] args) {
		/*
		 * Dato un numero casuale da 1 a 20, verificare se questo numero è presente in un array di 10 numeri casuali da 1 a 10.
			Se è presente indicare la posizione, altrimenti dire che non fa parte dell'array.
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] numeri = new int[10];
		
		int numeroCasuale = random.nextInt(1,21);
		
		for(int i = 0; i < numeri.length; i++) {
			
			int numeroArray;
			boolean doppione;
			do {
				numeroArray = random.nextInt(1,11);
				doppione = false;
				for(int j = 0; j < i; j++) {
					if(numeri[j] == numeroArray) {
						doppione = true;
						break;
					}
				}
			}while(doppione);
			numeri[i] = numeroArray;
			
			
		}
		
		System.out.println(Arrays.toString(numeri));
		System.out.println(numeroCasuale);
		
		boolean presente = false;
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] == numeroCasuale) {
				System.out.println("il numero "+numeri[i]+" è presente nell'array alla posizione "+i);
				presente = true;
				break;
			}
		}
		
		if(!presente) {
			System.out.println("il numero "+numeroCasuale+" non è presente nell'array alla posizione ");
		}
		
		scanner.close();
	}

}
