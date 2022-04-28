package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Read {

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '" + scan.nextLine() + "' is not valid.Please enter a numeric value.");
            }
          }while (true) ;
        }

    public float getFloat() {
        Scanner scan = new Scanner(System.in);
        float x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '" + scan.nextLine() + "' is not valid.Please enter a numeric value.");
            }
        }while (true) ;
    }

    public double getDouble() {
        Scanner scan = new Scanner(System.in);
        double x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '" + scan.nextLine() + "' is not valid.Please enter a numeric value.");
            }
        }while (true) ;
    }

    public String getString() {
        Scanner scan = new Scanner(System.in);
        String  x;
        do {
            try {
                System.out.println("Enter word;");
                x = scan.next();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '" + scan.nextLine() + "' is not valid.Please enter a word.");
            }
        }while(true);
        }
    }



