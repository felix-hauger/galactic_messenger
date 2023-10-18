package org.galacticmessenger;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.out.println("Hello and welcome!");
        System.out.println("Use the /help command to obtain help");

        // TODO: Replace it with socket connection
        Boolean inputExpected = true;

        while (inputExpected) {

            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            switch (input) {
                case "/register":
                    System.out.println("register");
                    System.out.println();
                    break;

                case "/login":
                    System.out.println("login");
                    System.out.println();
                    break;

                case "/help":
                    System.out.println("Use /login [yourusername] [yourpassword] command to login");
                    System.out.println("Use /register [yourusername] [yourpassword] command to register");
                    System.out.println("Use /exit command to exit the program");
                    System.out.println();
                    break;

                    // TODO: make logic if user is logged in

                case "/exit":
                    System.out.println("Exit");
                    inputExpected = false;

            }

        }

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.

            // Press Maj+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
    }
}