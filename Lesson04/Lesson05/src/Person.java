public class Person {
    private String name;
    private String prof;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String namePerson, String profPerson, String emailPerson, String phonePerson, int salaryPerson, int agePerson){
        this.name = namePerson;
        this.prof = profPerson;
        this.email = emailPerson;
        this.phone = phonePerson;
        this.salary = salaryPerson;
        this.age = agePerson;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + prof + " " + email + " " + phone + " " + String.valueOf(salary) + " " + String.valueOf(age));
    }


}
