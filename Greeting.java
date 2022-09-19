class Greeting {
    public static void main(String[] args) {
        System.out.println("Good morning");

        System.out.println("Good evening");

        System.out.println("Good afternoon");

        int var; // 短縮 int var = 1;

        var = 1;

        System.out.println(var);

        String[] arr;
        arr = new String[3];// 短縮 String[] arr = {"sato","tanaka","yamada"};

        arr[0] = "sato";
        arr[1] = "tanaka";
        arr[2] = "yamada";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int age = 18;

        if (age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println("child");
        }
    }
}