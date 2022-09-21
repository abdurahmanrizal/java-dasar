public class TipeDataArray {
    public static void main(String[] args) {
//        for create array initializer have two ways
//        first way
//        int[] stringArray = new int[] {
//                30, 10, 20, 50
//        };
//        second way
        int[] stringArray = { 30, 10, 20, 50};
        stringArray[0] = 0;
        stringArray[2] = 430;
        System.out.println(stringArray[0]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray.length);

        String[][] arrString = {
                {"Abdurahman", "Argoebie"},
                {"Jack", "Komboy"}
        };

        System.out.println(arrString[1][0]);
    }
}
