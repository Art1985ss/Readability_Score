import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] input = new Scanner(System.in).nextLine().toCharArray();
        StringBuilder output = new StringBuilder();
        int num = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                num++;
            } else {
                output.append(input[i - 1]).append(num);
                num = 1;
            }
        }
        output.append(input[input.length - 1]).append(num);
        System.out.println(output);
    }
}