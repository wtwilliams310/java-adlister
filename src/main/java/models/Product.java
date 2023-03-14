package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


    public class Product implements Serializable {
        private String name;

        private double price;

        private static List<Product> products = new ArrayList<>();



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public static List<Product> getProducts() {
            return products;
        }

        public static void setProducts(List<Product> products) {
            Product.products = products;
        }

        public Product() {
        }

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }



