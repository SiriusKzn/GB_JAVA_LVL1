public class Cats extends Animals{
    private static int countCats = 0;

    public static int getCountCats() {
        return countCats;
    }
    public Cats(String name) {
        super(name);
        countCats++;
    }

    public void swim(int dist) {
        System.out.println(this.name + " не умеет плавать.");
    }

    public void run(int dist){
        if (dist < 200 && dist > -200){
            System.out.println(this.name + " пробежал " + Math.abs(dist) + " метров.");
        } else
            System.out.println(this.name + " пробежал 500 метров и устал.");
    }
}
