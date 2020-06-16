class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? this.firstName : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? this.lastName : lastName;
    }

    public String getFullName() {
        String fullName = "";
        fullName = firstName.isEmpty() ? fullName : firstName;
        fullName = firstName.isEmpty() || lastName.isEmpty() ?
                fullName : fullName + " ";
        fullName = lastName.isEmpty() ? fullName : fullName + lastName;
        return "".equals(fullName) ? "Unknown" : fullName;
    }
}