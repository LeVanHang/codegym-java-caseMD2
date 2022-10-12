package storage.product;

import models.Product;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadData {
    public static ArrayList<Product> readData() {
        File file = new File("Product.txt");
        ObjectInputStream o = null;
        try {
            o = new ObjectInputStream(new FileInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            ArrayList<Product> products = (ArrayList<Product>) o.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            o.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
