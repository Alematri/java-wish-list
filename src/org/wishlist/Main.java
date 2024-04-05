package org.wishlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wishList = new ArrayList<>();

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.print("Inserisci il nome del regalo: ");
            String gift = scanner.nextLine();

            // Aggiungi all'ArrayList
            wishList.add(gift);

            // Mostra la lunghezza della lista
            System.out.println("Numero totale di regali: " + wishList.size());

            // Chiedi all'utente se vuole continuare
            System.out.print("Vuoi continuare ad aggiungere regali? (Sì/No): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("Sì")) {
                continueAdding = false;
            }
        }

        // Ordina la lista dei desideri in ordine alfabetico
        Collections.sort(wishList);

        // Stampa
        System.out.println("Lista dei desideri:");
        for (String gift : wishList) {
            System.out.println(gift);
        }

        scanner.close();
    }
}
