public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100; // consume memory 1 byte
        short iniShort = 1000; // consume memory 2 byte
        int iniInteger = 100000000; // consume memory 4 byte
        long iniLong = 1000000000; // consume memory 8 byte
        long iniLong2 = 1000000000L; // can use L on the behind, for flag type is long

        float iniFloat = 10.10F; // consume memory 4 byte
        double iniDouble = 10.11; // consume memory 8 byte

        // use underscore can use for readable number
        long amount = 1_000_000_000_00_0L;
//        System.out.println(amount);

//        convertion number on java have 2 type :
//        1. automatically (byte -> short -> int -> long -> float -> double)
//        2. manually (double -> float -> long -> int -> char -> short -> byte)

        byte iniByte2 = 100;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;

        int iniInt3 = 131;
        byte iniByte3 = (byte) iniInt3; // NUMBER OVERFLOW
        System.out.println(iniByte3);
    }
}
