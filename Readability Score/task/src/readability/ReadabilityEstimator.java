package readability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadabilityEstimator {
    private String text;
    private int wordsCount;
    private int sentenceCount;
    private int characterCount;
    private int syllables;
    private int polysyllables;

    public String estimateReadabilityOfFile(String filePath) {
        text = null;
        readFile(filePath);
        if (text.isEmpty()) {
            return "Failed to retrieve text.";
        }
        countWords();
        countSentences();
        countCharacters();
        countSyllables();
        return this.toString();
    }

    private void readFile(String filePath) {
        try {
            text = Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void countWords() {
        wordsCount = text.split("[?.!\\s]+").length;
    }

    private void countSentences() {
        sentenceCount = text.split("[?.!]+").length;
    }

    private void countCharacters() {
        characterCount = text.replaceAll("[\\n\\s]+", "").length();
    }

    private void countSyllables() {
        String[] words = text.split("[?.!\\s,]+");
        this.syllables = 0;
        this.polysyllables = 0;
        for (String s : words) {
            String str;
            if (s.matches(".*[AEIOUYaeiouy]$")) {
                str = s.substring(0, s.length() - 1);
            } else {
                str = s;
            }
            int vowel = 0;
            while (str.matches(".*[AEIOUYaeiouy]+.*")) {
                str = str.replaceFirst("[AEIOUYaeiouy]{1,2}", "");
                vowel++;
            }
            vowel = vowel == 0 ? 1 : vowel;
            syllables += vowel;
            polysyllables += vowel > 2 ? 1 : 0;
        }
    }

    public String scoreCalculation(String string) {
        StringBuilder stringBuilder = new StringBuilder("\n");
        double score;
        GradeLevel gradeLevel;
        String textFormat = "%s: %.2f (%s)\n";
        double average = 0;
        ReadabilityTests readabilityTests = ReadabilityTests.valueOf(string.toUpperCase());
        switch (readabilityTests) {
            case ALL:
            case ARI:
                score = calculateAriScore();
                gradeLevel = GradeLevel.getLevel(score);
                average = gradeLevel == null ? 0 : gradeLevel.getMaxAge();
                stringBuilder.append(String.format(textFormat, ReadabilityTests.ARI.getFullName(), score, gradeLevel));
                if (!readabilityTests.equals(ReadabilityTests.ALL)) {
                    break;
                }
            case FK:
                score = calculateFkScore();
                gradeLevel = GradeLevel.getLevel(score);
                average = gradeLevel == null ? 0 : gradeLevel.getMaxAge();
                stringBuilder.append(String.format(textFormat, ReadabilityTests.FK.getFullName(), score, gradeLevel));
                if (!readabilityTests.equals(ReadabilityTests.ALL)) {
                    break;
                }
            case SMOG:
                score = calculateSmogScore();
                gradeLevel = GradeLevel.getLevel(score);
                average = gradeLevel == null ? 0 : gradeLevel.getMaxAge();
                stringBuilder.append(String.format(textFormat, ReadabilityTests.SMOG.getFullName(), score, gradeLevel));
                if (!readabilityTests.equals(ReadabilityTests.ALL)) {
                    break;
                }
            case CL:
                score = calculateClScore();
                gradeLevel = GradeLevel.getLevel(score);
                average = gradeLevel == null ? 0 : gradeLevel.getMaxAge();
                stringBuilder.append(String.format(textFormat, ReadabilityTests.CL.getFullName(), score, gradeLevel));
                break;
            default:
                stringBuilder.append("Invalid option!");
        }
        if (readabilityTests == ReadabilityTests.ALL) {
            stringBuilder.append(String.format("\nThis text should be understood in average by %.2f year olds.", average / 4));
        }
        return stringBuilder.toString();
    }

    private double calculateAriScore() {
        return 4.71 * ((double) characterCount / wordsCount) + 0.5 * ((double) wordsCount / sentenceCount) - 21.43;
    }

    private double calculateFkScore() {
        return 0.39 * ((double) wordsCount / sentenceCount) + 11.8 * ((double) syllables / wordsCount) - 15.59;
    }

    private double calculateSmogScore() {
        return 1.043 * Math.sqrt((double) polysyllables * (30.0 / sentenceCount)) + 3.1291;
    }

    private double calculateClScore() {
        double l = (double) characterCount / wordsCount * 100;
        double s = (double) sentenceCount / wordsCount * 100;
        return 0.0588 * l - 0.296 * s - 15.8;
    }


    @Override
    public String toString() {
        return String.format("The text is: %s\n\nWords: %d\nSentences: %d" +
                        "\nCharacters: %d\nSyllables: %d\nPolysyllables: %d\n",
                text, wordsCount, sentenceCount, characterCount, syllables, polysyllables);
    }
}
