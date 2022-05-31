

public class HomeWorkApp {

       public static void main(String[] args){
           Person[] persArray =  new Person[5];
           persArray[0] = new Person("Pavel", "Engineer", "pavel_engineer@ya.ru", "+79657876975", 56000, 40);
           persArray[1] = new Person("Valery", "Engineer", "valery_engineer@ya.ru", "+79658635479", 65000, 45);
           persArray[2] = new Person("Igor", "Director", "igor_Director@ya.ru", "+7965123896", 100000, 55);
           persArray[3] = new Person("Yaroslav", "HR", "yaroslav_HR@ya.ru", "+79657541289", 40000, 25);
           persArray[4] = new Person("Yuliya", "Salesman", "yuliy_Salesman@ya.ru", "+79658657254", 45000, 30);

           for (int i = 0; i < persArray.length; i++){
               if (persArray[i].getAge() >= 40){
                   persArray[i].getInfo();
               }
           }

    }
}
