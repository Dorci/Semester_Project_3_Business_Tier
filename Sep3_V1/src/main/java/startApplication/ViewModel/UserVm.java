package startApplication.ViewModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVm
{

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
    private String confirmPassword;

    public UserVm(String firstName, String lastName, String emailAddress, String dob, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
    }

    public UserVm(int userId, String firstName, String lastName, String emailAddress, String dob, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
    }

    public UserVm(int userId, String firstName, String lastName, String emailAddress, String dob, String password, String confirmPassword) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserVm(int userId, String firstName, String lastName, String emailAddress, String dob) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
    }


    public UserVm() {
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

//    //    @JsonProperty("firstName")
//    private String firstName;
//    @JsonProperty("lastName")
//    private String lastName;
//    @JsonProperty("emailAddress")
//    private String emailAddress;
//    @JsonProperty("age")
//    private int age;
//    @JsonProperty("password")
//    private String password;
//    @JsonIgnore
//    private int userID;
}
