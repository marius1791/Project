package common;

import java.util.Random;


public class UserInfo {
//    public static void main(String[] args) {
//        System.out.println("Marius" + System.currentTimeMillis());
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Marius" + System.currentTimeMillis());
//        System.out.println("Marius" + System.currentTimeMillis());
// }

    public String username = "";
    public String company = "";
    public String password = "";
    public String username2 = "";
    public String validUsernameBlankSpace = "";
    public String validPasswordBlankSpace = "";
    public String specialCharacters = "";
    public String passwordSpecialCharacters = "";
    public String usernameDigits = "";
    public String passwordDigits = "";
    public String usernameLowercaseCredentials = "";
    public String passwordLowercaseCredentials = "";
    public String usernameUppercaseCredentials = "";
    public String passwordUppercaseCredentials = "";
    public String invalidEmail = "";
    public String invalidName = "";
    public String invalidMessage = "";
    public String validEmail = "";


    //generate valid random user info
    public UserInfo generateUser() {

        // Valid credentials
        RandomString randomString = new RandomString(8, new Random(), RandomString.lower);
        username = new RandomString(2, new Random(), RandomString.upper).nextString() +
                new RandomString(7, new Random(), RandomString.lower).nextString() +
                new RandomString(3, new Random(), RandomString.digits).nextString() +
                new RandomString(2, new Random(), RandomString.specialCharacter).nextString();
        password = username;
        company = username;
        username2 = "yopeso" + randomString.nextString();

        // Invalid Credentials-
        validUsernameBlankSpace = new RandomString(20, new Random(), RandomString.alphanum).nextString() +
                " ";
        validPasswordBlankSpace = validUsernameBlankSpace;
        specialCharacters = new RandomString(10, new Random(), RandomString.specialCharacter).nextString();
        passwordSpecialCharacters = specialCharacters;
        usernameDigits = new RandomString(10, new Random(), RandomString.digits).nextString();
        passwordDigits = usernameDigits;
        usernameLowercaseCredentials = new RandomString(10, new Random(), RandomString.lower).nextString();
        passwordLowercaseCredentials = usernameLowercaseCredentials;
        usernameUppercaseCredentials = new RandomString(10, new Random(), RandomString.upper).nextString();
        passwordUppercaseCredentials = usernameUppercaseCredentials;
        validEmail = new RandomString(10, new Random(), RandomString.lower).nextString() + "@gmail.com";
        invalidEmail = new RandomString(10, new Random(), RandomString.alphanum).nextString();
        invalidName = invalidEmail;
        invalidMessage = invalidEmail;


        // login name for mail validation flow
        return this;

    }


}



