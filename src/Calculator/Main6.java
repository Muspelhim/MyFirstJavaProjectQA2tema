package Calculator;


import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
    LogicalOperations logicalOperations = new LogicalOperations();

        List<Integer> integerList = logicalOperations.getListToNumber(100);

//        logicalOperations.printListFromNumber(integerList, 80);

        logicalOperations.printList(integerList);



    }

}
