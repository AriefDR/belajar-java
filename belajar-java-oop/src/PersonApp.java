public class PersonApp {
    static void main(String[] args) {
        var person1 = new Person("Lola", "Bali");
        person1.name = "AriefDr";
        person1.address = "Jakarta";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("AriefDr");

        Person person2 = new Person("Wawa");

        Person person3;
        person3 = new Person();
        person3.name = "Lala";
        person3.sayHello("Budi");


    }
}
