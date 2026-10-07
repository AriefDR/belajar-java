package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());
    }
}
