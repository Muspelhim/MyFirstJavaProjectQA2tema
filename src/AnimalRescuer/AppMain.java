package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {



         Chihuahua chihuahua = new Chihuahua();
         chihuahua.speak();
         chihuahua.play();


         Munchkin munchkin = new Munchkin();
         munchkin.speak();
         munchkin.play();


         Fjord fjord = new Fjord();
         fjord.speak();
         fjord.play();

         Veterinarian veterinarian = new Veterinarian();
         veterinarian.eat();
         veterinarian.speak();

         Girl girl = new Girl();
         girl.play();
         girl.eat();
         girl.speak();





    }
}
