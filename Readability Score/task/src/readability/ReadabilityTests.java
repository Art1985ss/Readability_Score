package readability;

public enum ReadabilityTests {
    ARI("Automated Readability Index"),
    FK("Flesch–Kincaid readability tests"),
    SMOG("Simple Measure of Gobbledygook"),
    CL("Coleman–Liau index"),
    ALL("all");

    private final String fullName;

    ReadabilityTests(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
