public class LogicalOperations {


    public  int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public  String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public  String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber){
            return firstNumber;
    } else {
            return secondNumber;
        }
}

    public  String verifySnowAmmount (int number);
     if ( number > 8 && number = 6); {
        return "The ammount of snow this winter was(cm)" + number;
         else {
            return "The forecast snow is(cm)" + number ;
        }
    }
