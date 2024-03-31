package DueListe2;

import java.util.Arrays;
import java.util.Scanner;

public class DueListe2 {

	public static void main(String[] args) {
		
		/*
		 * Scrivere il programma DueListe2 che chiede all'utente di inserire 5 numeri seguiti da altri 5 numeri e
		 * stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int somma = 0;
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arrComuni = new int[5];
		int numeriComuniIndex = 0;
		
		System.out.println("inserisci 5 numeri interi");
		for(int i = 0; i < arr1.length; i++) {
			int numero = scanner.nextInt();
			arr1[i] = numero;
		}
		System.out.println("inserisci altri 5 numeri interi");
		for(int i = 0; i < arr2.length; i++) {
			int numero = scanner.nextInt();
			arr2[i] = numero;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for (int num1 : arr1) {
			for (int num2 : arr2) {
				if(num1 == num2) {
					somma += num1;
					arrComuni[numeriComuniIndex++] = num1;
					break;
				}
			}
		}
		
		
		if(arrComuni.length > 0) {
			System.out.print("le due liste hanno "+arrComuni.length+" numeri in comune:");
			for(int i = 0; i < arrComuni.length; i++) {
				System.out.print(" "+arrComuni[i]+" ");
			}
			System.out.println("la somma dei numeri è: "+somma);
		}else {
			System.out.println("non ci sono numeri in comune");
		}
		
		scanner.close();
		
	}

}
