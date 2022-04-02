package Calculator;

import java.sql.SQLOutput;

public class Main3 {
    public static void main(String[] args) {


        System.out.println(getMax(12,41));

        System.out.println(verifyTextFastTrack("FastTrack"));

        String text = "FastTrack";
        int number = 5;
        int firstNumber = 5;


        System.out.println(verifyTextAndNumber(text, number));

        System.out.println(checkBiggerNumber(2,3));

             Calculator calc = new Calculator();
             System.out.println(calc.sum(2,3));
             System.out.println(calc.substract(2,3));
             LogicalOperations op = new LogicalOperations();
             System.out.println(verifyTextAndNumber(text,number));
    }

    private static int checkBiggerNumber(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public static String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }



}



