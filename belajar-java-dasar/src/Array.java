import java.util.Arrays;

public class Array {
    static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[10];
        stringArray[0] = "Arief";
        stringArray[1] = "Sharon";
        stringArray[2] = "Shania";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Devita";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[10];

        int[] arrayInt = new int[]{
                10, 20, 30, 40
        };

        long[] arrayLong = {
                10L, 20L, 30L, 40L
        };

        System.out.println(arrayLong.length);


        String[][] members = {
                {"Arief", "Dwi", "Rachmadian"},
                {"Sharon", "Alberta"},
                {"Devita"}
        };

        System.out.println(members[0][1]);
    }
}

