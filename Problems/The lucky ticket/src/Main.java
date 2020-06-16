import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] numbers = new Scanner(System.in).nextLine().split("");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += Integer.parseInt(numbers[i]);
            sum2 += Integer.parseInt(numbers[i + 3]);
        }
        System.out.println(sum1 == sum2 ? "Lucky" : "Regular");
    }
}