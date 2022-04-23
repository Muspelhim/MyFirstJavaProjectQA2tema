package Calculator;

public class Calculator {

    public double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public double sum(int firstNumber, double secondNumber, int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
    public double sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }


    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public double sum(double firstNumber, double secondNumber, double thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
    public double sum(double firstNumber, double secondNumber, int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }


    public int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }
    public int substract(int firstNumber, int secondNumber, int thirdNumber){
        int result = firstNumber - secondNumber - thirdNumber;
        return result;
    }
    public float substract(float firstNumber, float secondNumber){
        float result = firstNumber - secondNumber;
        return result;
    }


    public int multiply(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }
    public int multiply(int firstNumber, int secondNumber, int thirdNumber){
        int result = firstNumber * secondNumber * thirdNumber;
        return result;
    }
    public double multiply(int firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;
        return result;
    }


    public int divide(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }
    public float divide(float firstNumber, float secondNumber, float thirdNumber){
        float result = firstNumber / secondNumber / thirdNumber;
        return result;
    }


    public int modulus(int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        return result;
    }
    public double modulus(int firstNumber, int secondNumber, int thirdNumber){
        double result = firstNumber % secondNumber % thirdNumber;
        return result;
    }


    public int verifyNumberAndCount(int number) {
        return number;
    }
    public double verifyNumberAndCount(double number){
        return number;
    }
    public float verifyNumberAndCout(float number){
        return number;
    }

}
