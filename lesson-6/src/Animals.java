public class Animals {
    protected String name;
    private static int countAnimals = 0;

    public void run(int dist){
    }
    public void swim(int dist){
    }
    public static int getCountAnimals() {
        return countAnimals;
    }
    public Animals(String name) {
        countAnimals++;
        this.name = name;
    }
}
