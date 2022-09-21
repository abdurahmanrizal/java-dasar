public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 71;
//          String ucapan;
//            if we use if...else
//        if(nilai >= 75) {
//            ucapan = "Selamat anda lulus";
//        }else{
//            ucapan = "Silahkan coba lagi";
//        }
        String ucapan = nilai >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi";
        System.out.println(ucapan);
    }
}
