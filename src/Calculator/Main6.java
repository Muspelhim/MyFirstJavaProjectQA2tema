package Calculator;


import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
    LogicalOperations logicalOperations = new LogicalOperations();

//        List<Integer> integerList = logicalOperations.getListToNumber(90);
//
//        logicalOperations.printListFromNumbers(integerList,20);
//
//
//
//        logicalOperations.printListFromNumber(integerList, -1);
//
//        logicalOperations.printList(integerList);
//
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
//        System.out.println(newList);
//        newList.add(0, 16);
//        System.out.println(newList);


    logicalOperations.countBackwardsFromList(newList,3);
        System.out.println(newList);

        logicalOperations.showBiggestNumberFromList(newList);
        System.out.println(newList);



        }








    }


