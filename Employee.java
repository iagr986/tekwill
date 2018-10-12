package Tekwill;

public class Employee {

    String name;
    String country;
    int yearsOfBirh;
    double salary;
    String currency;
    String[] objects;
    double[] marks;

    void print() {
        System.out.println("Name: " + name);
        int years = 2018 - yearsOfBirh;
        System.out.println("Age: " + years);
        System.out.println("Place of birth: " + country);
        System.out.println("Salary: " + salary);
        System.out.println(" ");
        System.out.println("School marks:");
        for (int i = 0; i < objects.length; i++) {
            objects[i] = objects[i] + " " + marks[i];
            System.out.println(objects[i]);
        }
        System.out.println("------------------------------------------------------------------- ");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.name = "Alina Baleanu";
        person1.yearsOfBirh = 1994;
        person1.country = "Republic of Moldova";
        person1.salary = 8000;
        person1.currency = "MDL";
        person1.objects = new String[]{"Math", "Chemistry", "Fizic", "Biology", "English"};
        person1.marks = new double[]{7, 7.5, 8, 9, 10};
        person1.print();

        Employee person2 = new Employee();
        person2.name = "Arteom Baleanu";
        person2.yearsOfBirh = 1999;
        person2.country = "Republic of Moldova";
        person2.salary = 6000;
        person2.currency = "MDL";
        person2.objects = new String[]{"Math", "Chemistry", "Fizic", "Biology", "English"};
        person2.marks = new double[]{9, 8, 9, 9, 9};
        person2.print();
    }

}