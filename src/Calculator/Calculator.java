package Calculator;

public class Calculator {

    public double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multiply(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }

    public int divide(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }

    public int modulus(int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        return result;
    }

    public int verifyNumberAndCount(int number) {
        return number;
    }

}
