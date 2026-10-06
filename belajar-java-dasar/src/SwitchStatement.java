public class SwitchStatement {
    static void main(String[] args) {
        var nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Wow, Anda lulus Dengan baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Nilai anda cukup baik");
                break;
            case 'D':
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        switch (nilai) {
            case 'A' -> System.out.println("Wow, Anda lulus Dengan baik");
            case 'B', 'C' -> System.out.println("Nilai anda cukup baik");
            case 'D' -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
        String ucapan;
        switch (nilai) {
            case 'A' -> ucapan = "Wow, Anda lulus Dengan baik";
            case 'B', 'C' -> ucapan = "Nilai anda cukup baik";
            case 'D' -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case 'A':
                yield "Wow, Anda lulus Dengan baik";
            case 'B', 'C':
                yield "Nilai anda cukup baik";
            case 'D':
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };
    }
}
