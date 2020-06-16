package readability;

public enum GradeLevel {
    KINDERGARTEN("5-6", 1, 6),
    FIRST_SECOND_GRADE("6-7", 2, 7),
    THIRD_GRADE("7-9", 3, 9),
    FOURTH_GRADE("9-10", 4, 10),
    FIFTH_GRADE("10-11", 5, 11),
    SIXTH_GRADE("11-12", 6, 12),
    SEVENTH_GRADE("12-13", 7, 13),
    EIGHTH_GRADE("13-14", 8, 14),
    NINTH_GRADE("14-15", 9, 15),
    TENTH_GRADE("15-16", 10, 16),
    ELEVENTH_GRADE("16-17", 11, 17),
    TWELFTH_GRADE("17-18", 12, 18),
    COLLEGE_STUDENT("18-24", 13, 24),
    PROFESSOR("24+", 14, 25);

    private final String ageLevel;
    private final int score;
    private final int maxAge;

    GradeLevel(String ageLevel, int score, int maxAge) {
        this.ageLevel = ageLevel;
        this.score = score;
        this.maxAge = maxAge;
    }

    public String getAgeLevel() {
        return ageLevel;
    }

    public static GradeLevel getLevel(double score) {
        score = Math.ceil(score);
        score = score > 14 ? 14.0 : score;
        for (GradeLevel g : values()) {
            if (g.score == (int) score) {
                return g;
            }
        }
        return null;
    }

    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public String toString() {
        return String.format("about %d year olds", maxAge);
    }
}
