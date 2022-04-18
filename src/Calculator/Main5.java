package Calculator;

import calculator.LogicalOperations;

public class Main5 {

    public static void main(String[] args) {

       int[] myArray = new int[100];
       for (int i = 0; i <100; i++){
           myArray[i] = i + 1;
       }
       System.out.println(myArray);
       for (int i = 0; i<myArray.length; i++){
           System.out.println(myArray[i]+ ", ");
       }


//        op.printArray(myArray);

//        int[] testArray = {12,3,6765,123,6,856};
//        int sum = myArray[0];
//        sum = sum + myArray[1];
//        sum = sum + myArray[2];
//        sum = sum + myArray[3];
//        sum = sum + myArray[4];
//
//        System.out.println(op.getAverageFromArray(myArray));
//        System.out.println(op.getAverageFromArray(testArray));
//
//        int[] evenArray = new int[50];
//        op.populateArrayEvenNumber(evenArray);
//
//
//        op.printArray(evenArray);








    }
}