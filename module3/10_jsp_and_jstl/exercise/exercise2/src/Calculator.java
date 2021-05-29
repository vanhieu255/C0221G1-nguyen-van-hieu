public class Calculator {
    public static float calculator(float number1,float number2,String operator){
        float result=0;
        try {

            if (operator.equals("add")) {
                result = number1 + number2;
            } else if (operator.equals("sub")) {
                result = number1 - number2;
            } else if (operator.equals("mul")) {
                result = number1 * number2;
            } else if (operator.equals("div")) {
                result = number1 / number2;
            }
        }catch (Exception e){
            e.getMessage();
        }
        return result;
    }
}
