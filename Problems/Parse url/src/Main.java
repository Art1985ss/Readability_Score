import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String url = new Scanner(System.in).nextLine();
        String[] str = url.split("\\?");
        String password = "";
        str = str[str.length - 1].split("&");
        for (String s : str) {
            String[] data = s.split("=");
            password = "pass".equals(data[0]) && password.length() == 0 ? data.length == 1 ? "" : data[1] : password;
            System.out.printf("%s : %s", data[0], data.length == 1 ? "not found" : data[1]);
            System.out.println();
        }
        if (password.length() > 0) {
            System.out.println("password : " + password);
        }
    }
}