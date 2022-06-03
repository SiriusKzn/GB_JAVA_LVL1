public class Cat {
    private String name;
    private int apetit;
    private boolean satiety;

    public Cat(String name, int apetit) {
        this.name = name;
        this.apetit = apetit;
        this.satiety = false;
    }

    public void eat(Plate food){
        this.satiety = food.decreaseFood(apetit);
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String isName() {
        return name;
    }

}
