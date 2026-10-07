package programmer.zaman.now.data;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product("Mac m1", 10000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
