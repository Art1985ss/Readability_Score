import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] strings = new Scanner(System.in).nextLine().split(" ");
        String longest = "";
        for (String str: strings) {
            longest = str.length() > longest.length() ? str : longest;
        }
        System.out.println(longest);
    }
}