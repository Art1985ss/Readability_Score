import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(ch);
            result.append(ch);
        }
        System.out.println(result);
    }
}