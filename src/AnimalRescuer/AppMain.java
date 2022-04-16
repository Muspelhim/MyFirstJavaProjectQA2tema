package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Veterinarian dan = new Veterinarian();
        dan.isMale(true);
        System.out.println();



        Cat mitzi = new Cat();
        mitzi.setMale(false);
        System.out.println("Mitzi este fata");

        Pony murgu = new Pony();
        murgu.setMale(true);
        System.out.println("Murgu e baiat");

        Mouse jerry = new Mouse();
        jerry.setMale(true);
        System.out.println("Jerry este baiat");

        Dog barky = new Dog();
        barky.setColour("brown");
        System.out.println("Culoare lui barky este brown");



    }
}
