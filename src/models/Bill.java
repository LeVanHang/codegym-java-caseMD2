package models;

import validate.Validate;

import java.util.List;

public class Bill {
    private String userName;
    private List<Product> productList;
    private double totalPrice;
    private Validate purchaseDate;

    public Bill() {
    }

    public Bill(String userName, List<Product> productList, double totalPrice, Validate purchaseDate) {
        this.userName = userName;
        this.productList = productList;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
    }

    public String getUserName() {
        return userName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Validate getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "serName='" + userName + '\'' +
                ", productList=" + productList +
                ", totalPrice=" + totalPrice +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
