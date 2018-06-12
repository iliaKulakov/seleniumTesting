package testData;

public class User {

    public String login;
    public String password;
    public String passwordConfirmation;

    public static User createValidUser() {
        User user = new User();
        user.login = "test1";
        user.password = "test1";
        user.passwordConfirmation = user.password;
        return user;
    }
}

