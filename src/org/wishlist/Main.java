package org.wishlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList per memorizzare i regali
        ArrayList<String> wishList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Ciclo per chiedere l'inserimento all'utente
        boolean continueAdding = true;
        while (continueAdding) {
            System.out.print("Inserisci un regalo: ");
            String gift = scanner.nextLine();
            wishList.add(gift);

            System.out.println("Lunghezza della lista dei desideri: " + wishList.size());

            // Chiedere all'utente se terminare
            System.out.print("Vuoi aggiungere un altro regalo? (sì/no): ");
            String choice = scanner.nextLine().toLowerCase();
            continueAdding = choice.equals("sì") || choice.equals("si");
        }

        scanner.close();

    }
}