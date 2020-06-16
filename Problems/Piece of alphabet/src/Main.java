import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] + 1 != chars[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}