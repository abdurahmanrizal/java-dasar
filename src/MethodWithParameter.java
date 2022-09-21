public class MethodWithParameter {
    public static void main(String[] args) {
        penjumlahan(3,4);
        printYourName("Abdurahman", "Argoebie");
    }

    static void penjumlahan(int a,int b) {
        System.out.println(a + b);
    }

    static void printYourName(String firstName, String lastName) {
        System.out.println("Hello full name is " + firstName + " " + lastName);
    }
}
