package bai_tap.ValidateClass;

import thuc_hanh.Validateaccount.AccountExample;

public class TestValidateClass {

    private static Validate classExample;
    public static final String[] classValidate = new String[]{"C0318L", "M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new Validate();
        for (String account : classValidate) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);


        }
    }
}
