package Tekwill.Course;

public class Calculator {
    int getSum(int a, int b) {
        int sum = a + b;

        return sum;
    }

    int getSubtraction(int a, int b) {
        int diff = a - b;

        return diff;
    }

    double multiply(double a, double b) {
        double multiply = a * b;

        return multiply;
    }

    double divide(double a, double b) {
        double divide = a / b;

        return divide;
    }

    double[] qE(double a, double b, double c) {
        double[] solutions = new double[2];

        double d = b * b - 4 * a * c;
        if (d > 0) {
            solutions[0] = (-b + Math.sqrt(d)) / (2 * a);
            solutions[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            if (d == 0) {
                solutions[0] = solutions[1] = -b / (2 * a);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        }

        return solutions;

    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.getSum(5, 15);
        System.out.println("Sum = " + sum);

        int sub = calculator.getSubtraction(152, 52);
        System.out.println("Substaction = " + sub);

        double mult = calculator.multiply(6.5, 2);
        System.out.println("Multiply = " + mult);

        double divide = calculator.divide(11, 2);
        System.out.println("Divide = " + divide);

        double[] qE = calculator.qE(2, -4, -3);
        System.out.println("x1 = " +qE[0] + " x2 = " + qE[1]);


    }
}

