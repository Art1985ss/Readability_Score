import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double p = x1 * y1 + x2 * y2;
        double lenX = Math.sqrt(x1 * x1 + x2 * x2);
        double lenY = Math.sqrt(y1 * y1 + y2 * y2);
        p = p / (lenX * lenY);
        p = Math.acos(p);
        System.out.println(Math.toDegrees(p));
    }
}