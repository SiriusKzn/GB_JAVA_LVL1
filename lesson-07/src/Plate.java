public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n){
        if(this.food >= n) {
            this.food -= n;
            return true;
        } else {
            System.out.println("Cat didn't eat");
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int f){
        this.food += f;
    }

}
