import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        String[] strings = new String[0];
        File f = new File("./data");
        for (File file : Objects.requireNonNull(f.listFiles())) {
            System.out.println(file.getName());
        }
//        try {
//            strings = Files.readString(Paths.get("./data/dataset_91069.txt")).split("[^\\d]*");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("No file");
//        }
//        strings[0].replaceAll(",", "");
        f = new File("./data/dataset_91033.txt");
        int sum = 0;
        StringBuilder string = new StringBuilder();
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                //string.append(sc.nextLine()).append(" ");
                int a = sc.nextInt();
                System.out.println("a = " + a);
                sum += a;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s = string.toString();
        s = s.replaceAll(",", "");
        s = s.replaceFirst("\\D+", "");
        strings = s.split("\\s");
        long max = Integer.MIN_VALUE;
        int year = 0;
        for (int i = 2; i < strings.length; i += 2) {
            long a = Long.parseLong(strings[i + 1]);
            long b = Long.parseLong(strings[i - 1]);
            if (max < a - b){
                max = a - b;
                year = Integer.parseInt(strings[i]);
            }
        }
        System.out.println("year = " + year);
        System.out.println("sum = " + sum);
    }
}
