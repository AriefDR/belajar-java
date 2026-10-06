class VicePresident extends Employee {
    VicePresident(String name) {
        super(name);
    }

    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VP " + this.name);
    }
}
