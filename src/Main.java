//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      todo  University, School, Car жана Person деген класс тузунуз
//        Алардын свойстваларын ойлоп табыныз
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз

        Person person1 = new Person();
        person1.setName("Asan");
        person1.setAge(20);
        person1.setGender("M");
        person1.setProfession("IT");

        Person person2 = new Person();
        person2.setName("Jyldyz");
        person2.setAge(25);
        person2.setGender("F");
        person2.setProfession("IT");

        Person person3 = new Person();
        person3.setName("Kutman");
        person3.setAge(30);
        person3.setGender("M");
        person3.setProfession("director");
        Person[] people =  {person1,person2,person3};
        System.out.println("Class Persona:");
        for (Person perArray : people) {
            System.out.println(perArray.getPerson());

        }


        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Prius");
        car1.setColor("White");
        car1.setYear(2024);

        Car car2 = new Car();
        car2.setBrand("Honda");
        car2.setModel("Odyssey");
        car2.setColor("White");
        car2.setYear(2020);

        Car car3 = new Car();
        car3.setBrand("Tesla");
        car3.setModel("Model X");
        car3.setColor("Black");
        car3.setYear(2023);
        Car[] cars = {car1,car2,car3};
        System.out.println("Class Car:");
        for (Car carArray : cars) {
            System.out.println( carArray.getCar());

        }

        School school1 = new School();
        school1.setName("№66");
        school1.setAddress("Mambetova street");

        School school2 = new School();
        school2.setName("№ 1");
        school2.setAddress("Chugueva street");

        School school3 = new School();
        school3.setName("№45");
        school3.setAddress("Salieva street");
        School[] schoolArray = {school1,school2,school3};
        System.out.println("Class School:");
        for (School schoolFor : schoolArray) {
            System.out.println(schoolFor.getSchool());

        }

        University university1 = new University();
        university1.setName("KGUSTA");
        university1.setFaculties("Informatica");
        university1.setAddress("Maldybaeva");

        University university2 = new University();
        university2.setName("KGMA");
        university2.setFaculties("Hirurgia");
        university2.setAddress("Ahunbaeva");

        University university3 = new University();
        university3.setName("Politeh");
        university3.setFaculties("Informatica");
        university3.setAddress("Manasa");
University[] univer = {university1,university2,university3};
        System.out.println("Class University:");
        for (University univerFor : univer) {
            System.out.println( univerFor.getUniver());

        }
    }
}