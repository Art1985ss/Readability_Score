import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] numbers = input.split("-");
        System.out.printf("%s/%s/%s", numbers[1], numbers[2], numbers[0]);
    }
}