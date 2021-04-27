package bai_tap.ValidateNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

    private static final String number_REGEX = "^\\([0-9]{2}+\\)\\-[0]+[0-9]{9}+$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(number_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
