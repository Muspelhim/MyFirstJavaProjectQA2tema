package AnimalRescuer;

public abstract class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("miau!");
    }
    public void play(){
        System.out.println("Rolling the thread-ball");
    }
    public void eat(){
        System.out.println("Eating cat food");
    }
}

