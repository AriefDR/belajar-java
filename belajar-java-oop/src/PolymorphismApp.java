public class PolymorphismApp {
    static void main(String[] args) {
        Employee employee = new Employee("Arief");
        employee.sayHello("Budi");

        employee = new Manager("Panda");
        employee.sayHello("Budi");

        employee =  new VicePresident("Badak");
        employee.sayHello("Budi");

        sayHello(new Employee("Patrick"));
        sayHello(new Manager("Panda"));
        sayHello(new VicePresident("Budi"));

    }
    static void sayHello(Employee employee) {
        if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager" + manager.name);
        } else if(employee instanceof VicePresident) {
            VicePresident vice = (VicePresident) employee;
            System.out.println("Hello VicePresident" + vice.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
