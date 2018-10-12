package Tekwill;

public class TriangleAria {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 10;
        double p = (a + b + c) / 2.0; //triangle semiperimeter

        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Heron's formula
        System.out.println(result);

    }
}

