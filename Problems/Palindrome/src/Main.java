import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        for (int i = 0, j = input.length() - 1; i < input.length() / 2; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}