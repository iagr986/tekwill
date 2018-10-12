package Tekwill;

public class Employee2 {
    String name;
    String country;
    int age;
    double height;
    double salary;

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height " + height);
        System.out.println("Place of birth: " + country);
        System.out.println("Salary: " + salary);

    }

    Employee2 creatEmployee(String name, String country, int age, double height, double salary) {
        Employee2 person = new Employee2();
        person.name = name;
        person.country = country;
        person.age = age;
        person.height = height;
        person.salary = salary;


        return person;
    }


    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        Employee2 abaleanu = employee2.creatEmployee("Alina Baleanu", "Republic of Moldova", 24, 161, 8000);
        abaleanu.print();
    }
}