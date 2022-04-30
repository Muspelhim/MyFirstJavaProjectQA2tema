package Calculator;

public class MenuOptions {
    Read read = new Read();
    Calculator calc = new Calculator();
    public void doSum() {
        int firstNumber = read.getInt();
        int secondNumber = read.getInt();
        System.out.println("Suma este: " +
                calc.sum(firstNumber, secondNumber));

    }

    public void doSubstract() {
        int firstNumber = read.getInt();
        int secondNumber = read.getInt();
        System.out.println("Rezultatul este: " +
                calc.substract(firstNumber, secondNumber));
    }
    public void doMultiply() {
        int firtNumber = read.getInt();
        int secondNumber = read.getInt();
        System.out.println("Rezultatul este: "+
                calc.multiply(firtNumber,secondNumber));
    }
}
