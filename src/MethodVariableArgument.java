public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 90, 80, 10};
        sayCongrats("Abdurahman",values);
        sayCongratsWithArgument("Budi",90,30,100,100,10);
    }
//    without variable argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for(var value: values) {
            total += value;
        }

        var totalValue = total / values.length;

        if(totalValue >= 75) {
            System.out.println("Hi " + name + " selamat anda lulus");
        }else {
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }

//    with variable argument
    static void sayCongratsWithArgument(String name,int... values) {
        var total = 0;
        for(var value: values) {
            total += value;
        }

        var totalValue = total / values.length;

        if(totalValue >= 75) {
            System.out.println("Hi " + name + " selamat anda lulus");

        }else {
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }
}
