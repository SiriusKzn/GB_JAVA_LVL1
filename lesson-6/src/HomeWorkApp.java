public class HomeWorkApp {
    public static void main(String[] args) {
        Cats Barsik = new Cats("Барсик");
        Dog Bobik = new Dog("Бобик");
        Bobik.swim(5);
        Bobik.run(100);
        Barsik.run(-20);
        Barsik.swim(10);
        System.out.println(Animals.getCountAnimals());
        System.out.println(Dog.getCountDogs());
        System.out.println(Cats.getCountCats());
    }
}
