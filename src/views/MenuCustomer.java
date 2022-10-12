package views;

import controller.CartManager;
import controller.LoginManager;
import controller.ProductManager;
import storage.account.ReadData;

import java.util.Scanner;

public class MenuCustomer {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        CartManager cartManager = new CartManager();
        LoginManager loginManager = new LoginManager();
        ReadData.readData();
        storage.account.ReadData.readData();
        int choice;
        do {
            System.out.println("______ Menu Khach Hang _______");
            System.out.println("1. Products of the shop");
            System.out.println("2. Search products by name");
            System.out.println("3. Shopping");
            System.out.println("4. Show cart");
            System.out.println("5. Remove products from cart");
            System.out.println("6. Payment");
            System.out.println("7. Contribute ideas for the shop");
            System.out.println("8. Change Password");
            System.out.println("9. Sort products by price");
            System.out.println("0. Log out");
            System.out.println("______________________________");
            System.out.print("Pleace Enter Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> productManager.displayProduct();
                case 2 -> productManager.findByName(scanner);
                case 3 -> cartManager.addCart();
                case 4 -> cartManager.displayCart();
                case 5 -> cartManager.deleteProductInCart();
                case 6 -> cartManager.pay();
                case 7 -> cartManager.feedback(scanner);
                case 8 -> loginManager.changePassword(scanner);
                case 9 -> productManager.sortProductByPrice(scanner);
                case 0 -> MenuLogin.loginMenu();
            }
        } while (choice != 0) ;
    }
}
