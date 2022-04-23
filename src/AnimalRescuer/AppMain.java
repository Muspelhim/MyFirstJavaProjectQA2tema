package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {


         Animal animal = new Animal();
         animal.speak();
         Dog dog = new Dog();
         dog.speak();
         Chihuahua chihuahua = new Chihuahua();
         chihuahua.speak();
         chihuahua.play();

         Cat cat = new Cat();
         cat.speak();
         Munchkin munchkin = new Munchkin();
         munchkin.speak();
         munchkin.play();

         Pony pony = new Pony();
         pony.speak();
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
