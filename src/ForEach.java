public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Abdurahman", "Rizal", "Argoebie", "Siapa", "Aja"
        };

        System.out.println("For ... loop");
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("For ... each");
        for(var name: names) {
            System.out.println(name);
        }
    }
}
