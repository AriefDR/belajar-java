class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }
    //overloading
    Person(String paramName) {
       this(paramName, null);
    }
    // overloading
    Person() {
        this("");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
