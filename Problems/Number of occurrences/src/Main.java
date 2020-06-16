import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = sc.nextLine();
        int counter = 0;
        while (input.contains(str)) {
            input = input.replaceFirst(str, "");
            counter++;
        }
        System.out.println(counter);
    }
}