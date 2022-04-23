package AnimalRescuer;

public class Girl extends Human {
    private String name;
    private double funds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }
    public void eat(){
        System.out.println("Eating Cereal");
    }
    public void speak(){
        System.out.println("I'm a little girl");
    }
    public void play(){
        System.out.println("Playing hide and seek");
    }






}
