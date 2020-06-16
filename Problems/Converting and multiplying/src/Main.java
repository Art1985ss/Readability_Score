import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!"0".equals(input)) {
            try {
                System.out.println(Integer.parseInt(input) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
            input = sc.nextLine();
        }
    }

}