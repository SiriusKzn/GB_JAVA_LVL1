public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 10);
        cats[2] = new Cat("Petr Alexeevich", 25);
        cats[3] = new Cat("Veniamin", 15);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0 ; i < cats.length - 1; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0 ; i < cats.length - 1; i++) {
            System.out.println(cats[i].isName() + " " + cats[i].isSatiety());
        }
        plate.info();
        plate.addFood(40);
        plate.info();
    }
}
