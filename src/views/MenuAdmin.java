package views;

import controller.CartManager;
import controller.LoginManager;
import controller.ProductManager;
import storage.product.ReadData;

import java.io.Serializable;
import java.util.Scanner;

public class MenuAdmin implements Serializable {
    public static void menu() {
        ProductManager productManage = new ProductManager();
        CartManager cartManager = new CartManager();
        Scanner scanner = new Scanner(System.in);
        storage.account.ReadData.readData();
        ReadData.readData();
        int choice = -1;
        do {
            System.out.println("-------------------Menu Admin-------------------");
            System.out.println("1. Add product");
            System.out.println("2. Edit product ");
            System.out.println("3. Delete product by ID");
            System.out.println("4. Find product by ID");
            System.out.println("5. Find product by name");
            System.out.println("6. Find product by brand");
            System.out.println("7. Show all products of the shop");
            System.out.println("8. Show registered accounts");
            System.out.println("9. Delete customer account");
            System.out.println("10. Customer's feedback");
            System.out.println("0. Log out");
            System.out.println("_____________________________________");
            System.out.print("Pleace Enter Choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("please enter correctly!");
            }

            switch (choice) {
                case 1 -> productManage.addProduct(scanner);
                case 2 -> {
                    System.out.print("Enter the product ID you want to edit: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("------ Update san pham ------");
                    System.out.println("1. Edit brand name");
                    System.out.println("2. Edit product name");
                    System.out.println("3. Edit product price");
                    System.out.println("4. Edit amount product");
                    System.out.println("5. Edit size product");
                    System.out.println("_________________________");
                    System.out.print("Pleace Enter Choice: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1 -> productManage.editBrandName(scanner, id);
                        case 2 -> productManage.editProduceName(scanner, id);
                        case 3 -> productManage.editProducePrice(scanner, id);
                        case 4 -> productManage.editProduceAmount(scanner, id);
                        case 5 -> productManage.editProduceSize(scanner, id);
                    }
                }
                case 3 -> productManage.deleteProduct(scanner);
                case 4 -> productManage.findById(scanner);
                case 5 -> productManage.findByName(scanner);
                case 6 -> productManage.findByBrand(scanner);
                case 7 -> {
                    productManage.displayProduct();
                    productManage.updateAmount();
                }
                case 8 -> LoginManager.displayInformationCustomer();
                case 9 -> LoginManager.deleteAccount(scanner);
                case 10 -> cartManager.displayFeedback();
                case 0 -> MenuLogin.loginMenu();
            }
        } while (choice != 0);
    }
}