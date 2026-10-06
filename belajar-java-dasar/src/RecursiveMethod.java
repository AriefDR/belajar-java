public class RecursiveMethod {
    static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecutsive(5));
    }
    static int factorialLoop(int value) {
//        ada case stackoverflowerror ketika recursive terlalu dalam

        var result = 1;

        for(var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecutsive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecutsive(value-1);
        }
    }
}
