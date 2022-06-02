public class Dog extends Animals{
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    public void swim(int dist){
        if (dist < 10 && dist > -10){
            System.out.println(this.name + " проплыл " + Math.abs(dist) + " метров.");
        } else
            System.out.println(this.name + " проплыл 10 метров и устал.");
    }

    public void run(int dist){
        if (dist < 500 && dist > -500){
            System.out.println(this.name + " пробежал " + Math.abs(dist) + " метров.");
        } else
            System.out.println(this.name + " пробежал 500 метров и устал.");
    }

}
