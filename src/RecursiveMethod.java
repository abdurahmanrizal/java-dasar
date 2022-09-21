public class RecursiveMethod {
    public static void main(String[] args) {
//        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(10));
//       loop(5);
        System.out.println(searchCountOperation(13));
    }

    static int factorialLoop(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {
        if(value == 0) {
            System.out.println("Selesai");
        }else {
            System.out.println("Loop ke- " + value);
            loop(value - 1);
        }
    }

    static int searchCountOperation(int value) {

        if(value == 0) {
            return -1;
        }else {
            if(value % 2 == 0) {
                return 1 + searchCountOperation(value / 2);
            }else {
                return 1 + searchCountOperation(value - 1);
            }
        }
    }
}
