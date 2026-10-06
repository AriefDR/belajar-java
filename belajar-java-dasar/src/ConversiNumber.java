public class ConversiNumber {
    static void main(String[] args) {
        byte iniByte2 = 100;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong2 = iniInt2;
        float iniFloat2 = iniLong2;
        double iniDouble2 = iniFloat2;

        // kalo konversi dari atas ke bawah harus manual
        // hati hati kena number overflow
        float iniFloat22 = (float) iniDouble2;
        long iniLong22 = (long) iniFloat22;
        int iniInt22 = (int) iniLong22;
        short iniShort22 = (short) iniInt22;
    }
}
