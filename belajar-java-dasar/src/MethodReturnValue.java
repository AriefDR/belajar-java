public class MethodReturnValue {
    static void main(String[] args) {
        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(hitung(10, "+", 10));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int hitung(int a, String operasi, int b) {
        switch(operasi) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }
}
