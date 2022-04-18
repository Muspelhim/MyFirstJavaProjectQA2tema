package AnimalRescuer;

public class Animal {

    private String name;
    private String ownerName;
    private int ageInMonths;
    private double weightInKgs;
    private boolean isMale;
    private String favouriteFood;
    private String favouritePlay;
    private String sleep;
    private String eat;
    private String color;
    private String hunger;

    public String getHunger() {
        return hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }



    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    private String healthCondition;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }



    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouritePlay() {
        return favouritePlay;
    }

    public void setFavouritePlay(String favouritePlay) {
        this.favouritePlay = favouritePlay;
    }

}
