import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num = input.length() / 2;
        if (input.length() % 2 == 0) {
            num -= 1;
        }
        input = input.substring(0, num) + input.substring(input.length() - num);
        System.out.println(input);
    }
}