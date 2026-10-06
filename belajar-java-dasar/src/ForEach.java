public class ForEach {
    static void main(String[] args) {
        String[] names = {
                "Arief", "DR", "Belajar", "JAVA", "Sharon", "Alberta"
        };
        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("FOREACH");
        for(var name: names) {
            System.out.println(name);
        }
    }
}
