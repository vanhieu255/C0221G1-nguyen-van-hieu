package bai_tap.ValidateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String class_REGEX = "^[CPA]+[0-9]{4}[GHIKLM]+$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(class_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
