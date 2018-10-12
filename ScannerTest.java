package Tekwill;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = in.next();

        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.print("What's your height? ");
        double height = in.nextDouble();

        System.out.print("What's your weight? ");
        double weight = in.nextDouble();

        System.out.print("Will you suck my dick? ");
        String suck = in.next();

        if (suck.equals("no")){
            System.out.println("Suck my dick bitch");
        }
        else {
            System.out.println("Unexpected response");

        }
    }
}
