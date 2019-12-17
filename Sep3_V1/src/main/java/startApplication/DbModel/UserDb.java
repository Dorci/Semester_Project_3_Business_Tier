package startApplication.DbModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDb
{

    @JsonProperty("userId")
    private int userId;
    @JsonProperty("fName")
    private String firstName;
    @JsonProperty("lName")
    private String lastName;
    @JsonProperty("email")
    private String emailAddress;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("password")
    private String password;
    @JsonProperty("ConfirmPAssword")
    private String confirmPassword;

    public UserDb(int userId, String firstName, String lastName, String emailAddress, String dob, String password, String confirmPassword) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserDb(int userId, String firstName, String lastName, String emailAddress, String dob, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
    }

    public UserDb(String firstName, String lastName, String emailAddress, String dob, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
    }

    public UserDb() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "UserDb{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
