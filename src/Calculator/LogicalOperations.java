package calculator;

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

    public void countBackwards(int biggest, int smallest){
        for (int i = biggest; i >= smallest; i--){
            System.out.println(i);
        }
    }

    public void printSumAndAverage(int from, int to){
        int sum = 0;
        for(int i = from; i <= to; i++){
            sum = i + sum;
        }
        System.out.println(sum);
        System.out.println(sum/(to-from+1f));
    }
    public double getAverageFrom7Numbers(int from, int to){
        int x = from;
        int sum = 0;
        double counter = 0;
        while(x <= to){
            if(x % 7 == 0){
                sum = x + sum;
            }
            x++;
            counter++;

        }
        System.out.println(counter);
        return sum/counter;
    }

    public int[] populateArrayToNumber(int max){
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public double sumOfArray(int[] array){
        float sumArray = array[0];
        for (int i = 1; i < array.length; i++){
            sumArray = sumArray + array[i];
        }
        return sumArray;
    }

    public double getAverageFromArray(int[] array){
        return sumOfArray(array)/array.length;
    }

    public void populateArrayEvenNumber(int[] array){
        int pos = 0;
        for (int i = 1; i <= array.length/2; i++){
            if (i % 2 == 0){
                array[pos] = i;
                pos++;
            }
        }

    }

}
