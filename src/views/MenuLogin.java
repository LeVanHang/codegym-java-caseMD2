package views;

import controller.LoginManager;

import java.util.Scanner;

import storage.product.ReadData;

public class MenuLogin {

    public static void loginMenu() {
        Scanner scanner = new Scanner(System.in);
        LoginManager loginManager = new LoginManager();
        storage.account.ReadData.readData();
        ReadData.readData();
        int choice = -1;
        do {
            System.out.println("*****************************");
            System.out.println("---------------->Menu<----------------");
            System.out.println("**          1. Login             **");
            System.out.println("**          2. Register                  **");
            System.out.println("------------------------------------------");
            System.out.println("**          0. Exit the system        **");
            System.out.println("*****************************");
            System.out.print("------ > Pleace Choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Please enter correctly!");
            }

            switch (choice) {
                case 1 -> loginManager.login(scanner);
                case 2 -> loginManager.addAccount();
                case 0 -> System.exit(0);
            }
        } while (true);
    }
}