import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d != 0) {
            d = (b + c) / d;
            if (d != 0) {
                int result = a / d;
                System.out.println(result);
                return;
            }
        }
        System.out.println("Division by zero!");
    }
}