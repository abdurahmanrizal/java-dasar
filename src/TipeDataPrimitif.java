public class TipeDataPrimitif {
    public static void main(String[] args) {
        int iniAge = 30;

        Integer iniObjectAge = iniAge;

//       convert from not primitif to primitif
        System.out.println(iniObjectAge.byteValue());
        Long amount = 100_000L;
        System.out.println(amount.floatValue());
    }
}
