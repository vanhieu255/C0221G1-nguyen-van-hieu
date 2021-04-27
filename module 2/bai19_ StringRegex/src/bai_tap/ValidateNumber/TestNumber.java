package bai_tap.ValidateNumber;

import bai_tap.ValidateClass.Validate;

public class TestNumber {

    private static Number numberExample;
    public static final String[]numberValidate = new String[]{"(83)-0123456789", "(84)-3123456789", "(8a)-0123456789"};
    public static void main(String[] args) {
        numberExample=new Number();
        for (String account : numberValidate) {
            boolean isvalid = numberExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);


        }

    }
}
