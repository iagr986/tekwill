package Tekwill;

public class MaxNumber {
    public static void main(String[] args) {
        int[] number = {6, 2, 16};

        if (number[0] >= number[1] && number[0] >= number[2])
            System.out.println(number[0] + " is the largest number.");
        else if (number[1] >= number[0] && number[1] >= number[2])
            System.out.println(number[1] + " is the largest number.");
        else
            System.out.println(number[2] + " is the largest number");


    }
}
