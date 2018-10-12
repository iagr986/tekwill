package Tekwill;

public class QuadraticEquation {
    public static void main(String[] args) {
        //Quadratic equation ax^2+bx+c=0
        int a = 2;
        int b = -4;
        int c = -3;
        double d = b * b - 4 * a * c; // Discriminant b2−4ac

        if (d > 0) { // has 2 real roots
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (d == 0) { //has one root
            double x = (-b / (2 * a));
            System.out.println("x1 = x2 = " + x);

        } else {
            System.out.println("No roots");
        }


    }
}
