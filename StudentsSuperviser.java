package Tekwill;

//Create a class StudentsSuperviser which has a static list of students and a static variable studentsLength which is increased each time a new student is added in StudentsSuperviser's students list.
//In main method (`starting point of the Java application`) start creating a list of students of 3 elements and after that assign that list to StudentsSuperviser's students state (attribute / property).
//Add two new Students to that list and then print StudentsSuperviser's studentsLength in order to see if it prints correctly the length of students list. (Which should be 5).
//Student class has name and age (of String and int data types)
public class StudentsSuperviser {
    public static void main(String[] args) {

        new Student("Ali", 35);
        new Student("Osama", 53);
        new Student("Jomapeli", 57);
        new Student("Abubakar", 123);
        new Student("Tayyip",64);

        Student.print();
    }

    static public class Student {
        static String name;
        static int age;

        static int studentsLenght;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            studentsLenght++;
        }

        public static void print() {
            System.out.println("Number of students: " + studentsLenght);
            for (int i = 0; i < studentsLenght; i++) {
                System.out.println(name + " " + age + " ");

            }
        }
    }
}



