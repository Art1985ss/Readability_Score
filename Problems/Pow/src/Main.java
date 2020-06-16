import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        System.out.println(Math.pow(Double.parseDouble(input[0]), Double.parseDouble(input[1])));
    }
}