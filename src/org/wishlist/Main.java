package org.wishlist;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static final String FILENAME = "wishlist.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Wish> wishList = new ArrayList<>();

        boolean continueAdding = true;
        while (continueAdding) {
            // Input utente
            System.out.print("Inserisci il nome del regalo: ");
            String giftName = scanner.nextLine();
            Wish wish = new Wish(giftName);

            // Aggiungo all'ArrayList
            wishList.add(wish);

            // Mostra la lunghezza dell'array'
            System.out.println("Numero totale di regali: " + wishList.size());

            // Chiedi all'utente se vuole continuare
            System.out.print("Vuoi continuare ad aggiungere regali? (Sì/No): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("Sì")) {
                continueAdding = false;
            }
        }

        // Ordina la lista
        Collections.sort(wishList);

        // Scrivi la lista su file
        printWishListToFile(wishList);

        scanner.close();
    }

    private static void printWishListToFile(ArrayList<Wish> wishList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Wish wish : wishList) {
                writer.println(wish.getName());
            }
            System.out.println("Lista dei desideri salvata su file: " + FILENAME);
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura su file: " + e.getMessage());
        }
    }
}
