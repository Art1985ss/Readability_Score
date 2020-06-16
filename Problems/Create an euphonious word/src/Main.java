import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int vowel = 0;
        int consonants = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            vowel = isVowel(input.charAt(i)) ? vowel + 1 : 0;
            consonants = isVowel(input.charAt(i)) ? 0 : consonants + 1;
            count = vowel == 3 || consonants >= 3 ? count + 1 : count;
            vowel = vowel == 3 ? vowel - 2 : vowel;
            consonants = consonants == 3 ? consonants - 2 : consonants;
        }
        System.out.println(count);
    }

    public static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char c : vowels) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}