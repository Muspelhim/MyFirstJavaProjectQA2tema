package Calculator;

public class Main4 {

    public static void main(String[] args) {
        //Write a java program to count backwards from a given number to a lower given number
//        int x = 9;
//        int y = 3;
        LogicalOperations logicalOperations = new LogicalOperations();
//
//        logicalOperations.countBackwards(100, y);
//        System.out.println("After");
//        logicalOperations.countBackwards(x, y);

        //Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
        // Also compute and display the average.

//        logicalOperations.printSumAndAverage(1,100);

        //Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.

        double x = logicalOperations.getAverageFrom7Numbers(10,100000);
        System.out.println(x);
        System.out.println(logicalOperations.getAverageFrom7Numbers(10,100000));
    }

}