package Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

//        int[] myArray = new int[]{3,4,5};
//
//        try{
//            System.out.println(myArray[4]);
//        }catch (IndexOutOfBoundsException elefant){
////            System.out.println(elefant.getMessage());
//            System.err.println("Valoarea este incorecta!");
//        }
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        try{
//            int position = scan.nextInt();
//            System.out.println(myArray[position]);
//        }catch (Exception e){
//            System.err.println("Invalid value!");
//        }
//
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//
//        System.out.println(list.get(3));

        Read read = new Read();
        System.out.println(read.getInt());
        System.out.println(read.getFloat());
        System.out.println(read.getDouble());

    }
}