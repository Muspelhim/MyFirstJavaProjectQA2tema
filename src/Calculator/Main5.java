package Calculator;

public class Main5 {

    public static void main(String[] args) {
        calculator.LogicalOperations op = new calculator.LogicalOperations();
        int[] myArray = op.populateArrayToNumber(100);

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

        int[] evenArray = new int[50];
        op.populateArrayEvenNumber(evenArray);


        op.printArray(evenArray);
    }
}