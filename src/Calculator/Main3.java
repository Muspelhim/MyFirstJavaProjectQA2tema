package Calculator;

public class Main3 {

    public static void main(String[] args) {


//        System.out.println(getMax(12,41));

//        System.out.println(verifyTextFastTrack("FastTrack"));


        String text = "FastTrack";
        int number = 6;

        System.out.println(verifyTextAndNumber(text,number));


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

    public static String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }
}