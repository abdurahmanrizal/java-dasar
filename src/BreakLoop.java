public class BreakLoop {
    public static void main(String[] args) {
        var counter = 1;

        while(true) {
            System.out.println("Perulangan ke-" + counter);


            if(counter >= 10) {
                break;
            }
            counter++;
        }

        System.out.println("Perulangan berhenti");
    }
}
