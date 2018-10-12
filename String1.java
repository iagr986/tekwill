package Tekwill;

public class String1 {
    public static void main(String[] args) {
        String phoneNumber = "404-214-2142";
        int idx1 = phoneNumber.indexOf('-');

        System.out.println(idx1);

        int idx2 = phoneNumber.indexOf('-', idx1+1);
        System.out.println(idx2);
    }
}
