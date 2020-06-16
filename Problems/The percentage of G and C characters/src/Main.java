import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toLowerCase().toCharArray();
        double gc = 0;
        for (char ch : chars) {
            gc = ch == 'g' || ch == 'c' ? gc + 1 : gc;
        }
        System.out.println((gc / chars.length) * 100);
    }
}