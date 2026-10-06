public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 80, 80};
        sayCongrats("Arief", values);
        sayCongrats("Sharon", 10,20,30,40);
    }
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for(var value: values) {
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue > 75) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("Maaf " + name + " tidak lulus");
        }
    }
}
