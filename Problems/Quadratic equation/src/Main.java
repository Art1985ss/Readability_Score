import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x1 = 0;
        double x2 = 0;
        c = Math.sqrt(b * b - 4 * a * c);
        x1 = (-b - c) / (2 * a);
        x2 = (-b + c) / (2 * a);
        System.out.println(Math.min(x1, x2));
        System.out.println(Math.max(x1, x2));
    }
}