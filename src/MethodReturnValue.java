public class MethodReturnValue {
    public static void main(String[] args) {
//        System.out.println(sum(100,200));
        String[] names = {"Rahman","Jack","Rahman","RahmanJack","Ricky"};
        System.out.println(sumNameNotRahman(names));
        int[] numbers = {2, 3, 10, 15, 22, 40};
        System.out.println(sum(numbers,true));
        System.out.println(sum(numbers, false));
        System.out.println(hitung(200,"-", 50));
        System.out.println(hitung(200,"*", 50));
    }

//    static int sum(int value1, int value2) {
//        return value1 + value2;
//    }

    static int sumNameNotRahman(String[] array) {
        int counter = 0;
        for(var name: array) {
           if(name != "Rahman") {
               counter++;
           }
        }

       return counter;
    }

    static int sum(int[] numbers, boolean isEven) {
        int sum = 0;
        // sum is even, if value is even true
        // sum is odd, if value is even false
        for(var number: numbers) {
            if(isEven) {
                if(number % 2 == 0) {
                    sum += number;
                }
            }else {
                if(number % 2 == 1) {
                    sum += number;
                }
            }

        }
        return sum;
    }

    static int hitung(int number1, String operasi, int number2) {
        switch (operasi) {
            case "+" :
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }
    }
}
