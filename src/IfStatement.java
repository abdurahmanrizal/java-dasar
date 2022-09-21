public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        var nilaiAbsen = 75;
        var nilaiValue = 75;

        if(nilai >= nilaiValue && absen >= nilaiAbsen) {
            System.out.println("Anda Lulus!");
        }else {
            System.out.println("Coba lagi!");
        }
    }
}
