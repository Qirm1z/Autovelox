package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random(); // dichiaro un generatore di numeri casuali.

		int vel, lim, diff = 0;

		boolean conferma = true;

		do {
			do {
				vel=r.nextInt(250)+1;
				lim=r.nextInt(250)+1;
				/*
				System.out.println("Inserisci il limite di velocità: ");
				lim = sc.nextInt();
				System.out.println("Inserisci velocità rilevata: ");
				vel = sc.nextInt();
				*/
				System.out.println("Velocità rilevata: "+vel);
				System.out.println("Limite immesso: "+lim);
				if (vel <= 0 || lim <= 0)
					System.out.println("Dati inseriti non validi.");
			} while (vel <= 0 || lim <= 0);

			diff = vel - lim;

			if (vel <= 100 && diff < 5) {
				System.out.println("Hai rispettato il limite.");
			} else if (vel > 100 && vel < (lim * 105) / 100) {
				System.out.println("Hai rispettato il limite.");
			} else if (vel <= 100 && diff >= 5) {
				System.out.print("Hai superato il limite di " + diff + "km/h");
			} else if (vel > 100 && vel > (lim * 105) / 100) {
				System.out.print("Hai superato il limite di " + diff + "km/h");
			}
			if (diff >= 5 && diff < 10)
				System.out.println(", la sanzione è tra 42€ e 173€.");
			else if (diff >= 10 && diff < 40)
				System.out.println(", la sanzione è tra 173€ e 694€.");
			else if (diff >= 40 && diff < 60)
				System.out.println(", la sanzione è tra 543€ e 2170€.");
			else if (diff >= 60)
				System.out.println(", la sanzione è tra 845€ e 3382€.");
			/*
			 * ho cercato di unire in un'unico blocco le sanzioni sia in caso la velocità
			 * ecceda i 100 sia nel caso essa sia inferiore, in tal modo il codice risulta
			 * più conciso e leggibile; ho trovato online un metodo alternativo che involve
			 * un private state void, ma essendo che non è stato ancora spiegato in classe e
			 * -francamente- non ho la benchè minima idea di come implementarlo, mi sono
			 * astenuto dall'utilizzarlo.
			 */

			System.out.println("Controllare altri veicoli? (sì/no)");
			String input = sc.next();
			conferma = input.equalsIgnoreCase("sì");
		} while (conferma);

		sc.close();
	}
}