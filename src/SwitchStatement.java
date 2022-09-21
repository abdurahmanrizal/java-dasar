public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 'A';
//        switch (nilai) {
//            case 'A':
//                System.out.println("Wow, nilai anda sangat baik");
//                break;
//            case 'B':
//            case 'C':
//                System.out.println("Nilai anda sudah lulus");
//                break;
//            case 'D':
//                System.out.println("Anda tidak lulus");
//                break;
//            default:
//                System.out.println("Mungkin anda salah jurusan");
//        }

//        switch lambda, we can use on java 14
//        switch (nilai) {
//            case 'A' -> System.out.println("Wow, nilai anda sangat baik");
//            case 'B', 'C' -> System.out.println("Nilai anda sudah lulus");
//            case 'D' -> System.out.println("Anda tidak lulus");
//            default -> System.out.println("Mungkin anda salah jurusan");
//        }
//        WITHOUT YIELD
//        String ucapan;
//        switch (nilai) {
//            case 'A' -> ucapan = "Wow, nilai anda sangat baik";
//            case 'B', 'C' -> ucapan = "Nilai anda sudah lulus";
//            case 'D' -> ucapan = "Anda tidak lulus";
//            default -> ucapan = "Mungkin anda salah jurusan";
//        }

//        WITH YIELD

        String ucapan = switch (nilai) {
            case 'A':
                yield "Wow, nilai anda sangat baik";
            case 'B' , 'C':
                yield  "Nilai anda sudah lulus";
            case 'D':
                yield  "Anda tidak lulus";
            default:
                yield  "Mungkin anda salah jurusan";
        };

        System.out.println(ucapan);

    }
}
