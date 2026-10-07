package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Arief";
        first = first + " " + "DR";

        System.out.println(first);

        String second = "Arief DR";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Arief DR";
        System.out.println(third);

        System.out.println(second == third);
    }
}
