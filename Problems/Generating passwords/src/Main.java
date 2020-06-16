import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperLetters = sc.nextInt();
        int lowerLetters = sc.nextInt();
        int digits = sc.nextInt();
        int symbols = sc.nextInt();
        StringBuilder password = new StringBuilder();
        int count = 0;
        while (symbols > password.length()) {
            int total = upperLetters + lowerLetters + digits;
            if (upperLetters > 0 || total <= 0) {
                password.append((char) ('A' + count % 26));
                upperLetters--;
            }
            if (lowerLetters > 0 || total <= 0) {
                password.append((char) ('a' + count % 26));
                lowerLetters--;
            }
            if (digits > 0 || total <= 0) {
                password.append((char) ('0' + count % 10));
                digits--;
            }
            if (password.length() > symbols) {
                password = new StringBuilder(password.substring(0, symbols));
            }
            count++;
        }
        System.out.println(password);

    }
}