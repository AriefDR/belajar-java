import java.util.Arrays;
import java.util.Scanner;

public class TodoList {
    public static String[] TodoList = new String[2];
    public static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     *
     */
    public static void showTodoList() {
        System.out.println("TODO: ");
        for (int i = 0; i < TodoList.length; i++) {
            var todo = TodoList[i];
            var no = i + 1;
            if (todo != null) {
                System.out.println(no + ". " + todo);
            } else {
                break;
            }
        }
    }

    public static void testShowTodo() {
        TodoList[0] = "satu";
        TodoList[1] = "dua";
        TodoList[2] = "tiga";
        showTodoList();
    }

    /**
     *
     * @param todo
     */
    public static void addTodo(String todo) {
        // cek penuh arraynya?
        var isFull = true;
        for (int i = 0; i < TodoList.length; i++) {
            if (TodoList[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika penuh array
        if (isFull) {
            var temp = TodoList;
            TodoList = new String[TodoList.length * 2];
            for (int i = 0; i < temp.length; i++) {
                TodoList[i] = temp[i];
            }
        }

        //insert data ke null
        for (int j = 0; j < TodoList.length; j++) {
            if (TodoList[j] == null) {
                TodoList[j] = todo;
                break;
            }
        }
    }

    public static void testAddTodo() {
        for (int j = 0; j < 5; j++) {
            addTodo("Contoh ke " + j);
        }
        showTodoList();
    }

    public static boolean removeTodo(Integer rm) {
        if ((rm - 1) >= TodoList.length) {
            return false;
        } else if (TodoList[rm - 1] == null) {
            return false;
        } else {
            for (int j = (rm - 1); j < TodoList.length; j++) {
                if (j == (TodoList.length - 1)) {
                    TodoList[j] = null;
                } else {
                    TodoList[j] = TodoList[j + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodo() {
        addTodo("Satu");
        addTodo("Dua");
        addTodo("Tiga");
        addTodo("Empat");
        addTodo("Lima");

        var result = removeTodo(20);
        System.out.println(result);

        result = removeTodo(4);
        System.out.println(result);

        result = removeTodo(2);
        System.out.println(result);

        showTodoList();

    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void tesInput(){
      var name = input("Nama");
        System.out.println("Hi " + name);

        var channel =  input("Channel");
        System.out.println("Channel: " + channel);
    }

    public static void viewShowTodoList(){
        while(true){
            showTodoList();
            System.out.println();
            System.out.println("======================================");
            System.out.println("                 MENU                 ");
            System.out.println("======================================");
            System.out.println("[1]. Tambah");
            System.out.println("[2]. Hapus");
            System.out.println("[X]. Exit");
            System.out.println("=====================================");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddTodo();
            } else if (input.equals("2")) {
                viewRemoveTodo();
            } else if (input.equals("x") ||  input.equals("X")) {
                break;
            } else {
                System.out.println("Invalid input");
            }
            System.out.println();
        }
    }

    public static void testViewShowTodo() {
        addTodo("Satu");
        addTodo("Dua");
        addTodo("Tiga");
        addTodo("Empat");
        addTodo("Lima");
        viewShowTodoList();
    }
    public static void viewAddTodo(){
        System.out.println("Add TodoList");

        var todo = input("Todo: x jika batal");
        if(todo.equals("x") || todo.equals("x")){
            //PASS
        } else {
            addTodo(todo);
        }
    }

    public static void testViewAddTodo(){
        addTodo("Satu");
        addTodo("Dua");
        addTodo("Tiga");
        addTodo("Empat");
        addTodo("Lima");

        viewAddTodo();
        showTodoList();

    }
    public static void viewRemoveTodo(){
        System.out.println("Remove TodoList");
        showTodoList();
        System.out.println();

        var number = input("Delete Numbr: x(jika batal)");
        if(number.equals("x") || number.equals("x")){
            //PASS
        } else {
            boolean success = removeTodo(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todo: " + number);
            }
        }
    }
    public static void testViewRemoveTodo(){
        addTodo("Satu");
        addTodo("Dua");
        addTodo("Tiga");

        viewRemoveTodo();
        showTodoList();
    }
}
