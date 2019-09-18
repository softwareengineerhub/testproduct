package ua.itea.app.utils;

public class ValidationUtils {
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public static boolean checkEmail(String email) {

        if (email == null || !email.matches(EMAIL_PATTERN))
            return false;
        return true;
    }

    public static boolean checkPass(String pass) {
        if (pass == null || pass.length() < 4 || pass.length() > 12)
            return false;
        return true;
    }

}
