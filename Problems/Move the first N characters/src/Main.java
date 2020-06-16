import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = sc.nextInt();
        if (n < input.length()) {
            input = input.substring(n) + input.substring(0, n);
        }
        System.out.println(input);
    }
}