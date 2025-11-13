package Arrays;

public class Resoning {

    static String Reverse(String str) {
        String ch = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i) + ch;
        }
        return ch;
    }

    public static void main(String[] args) {

//        String str = "Abhishek";
        String name = Reverse("Hello");

        System.out.println(name);
    }
}
