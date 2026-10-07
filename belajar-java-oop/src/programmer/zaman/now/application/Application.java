package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Application {
    static void main(String[] args) {
        Product product = new Product("thinkpad", 100000);
        System.out.println(product);
    }
}
