package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog constantin = new Dog();
        Veterinarian severian = new Veterinarian();
        int x = 3;
        System.out.println(x);
        System.out.println("Varsta catelului este: " + constantin.ageInMonths);
        System.out.println("Numele veterinarului este" + severian.name );

        constantin.name = "TRex";
        constantin.race = "";
        System.out.println(constantin.name);
        constantin.run();

        Dog const2 = new Dog();
        System.out.println(const2.name);
        Cat mitzi = new Cat();
        Girl andra = new Girl();
        Veterinarian iustinian = new Veterinarian();


    }
}
