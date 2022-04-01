public class Main2 {
    static int memberVariable = 3;

//
//    public static void main(String[] args) {
////
//    }
////
//        double result = sum(memberVariable, 3.2);
//        System.out.println(result * 2);
//        System.out.println("Rezultatul este: " + sum(3, 5));
//
//        int result2 = substract(5, 4);
//        System.out.println(result2);
//
//        System.out.println(result - result2);
//
//    public static double sum(int firstNumber, double secondNumber) {
//        return firstNumber + secondNumber;
//    }
//
//    public static int substract(int firstNumber, int secondNumber) {
//        int result = firstNumber - secondNumber;
//        return result;
//    }
// Tema aici

    public static void main(String[] args) {

        System.out.println("Multiply: " + increase(24, 67));

        System.out.println("Divide: " + divide(45, 65.9));

        System.out.println("Average: " + average(2, 8, 9));

        System.out.println("Temperature: " + temperature(65, 5, 9));

        System.out.println("Distance: " + distance(100));

        System.out.println("Speed: " + speed(1000, 2300, 500, 60));

        System.out.println(
                "      J     a    V     V   a\n" +
                        "      J    a a    V   V   a a\n" +
                        "  J   J   aaaaa    V V   aaaaa\n" +
                        "   J J   a     a    V   a     a\n");


        //      Omuletul are capul putin stramb de la atata Java

        System.out.println("+\"\"\"\"\"+ \"\n" +
                "[| o   o |]  \n" +
                " |   ^   |\n" +
                " |  '_'  |\n" +
                " +-------+)");

    }


    public static long increase(long firstNumber, long secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(float firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static float average(float firstNumber, float secondNumber, float thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }

    public static float temperature(float firstNumber, float secondNumber, float thirdNumber) {
        return (secondNumber / thirdNumber * (firstNumber - 32));
    }

    public static double distance(double firstNumber) {
        return (firstNumber / 39.37);
    }

    public static double speed(double firstNumber, double secondNumber, double thirdNumber, double forthNumber) {
        return (firstNumber / secondNumber);
        return ((0.001 * firstNumber) / thirdNumber);
        return ((firstNumber / 1609) / forthNumber);
    }
    }
}
