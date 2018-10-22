package Tekwill;

public class IsLucky {
    public static void main(String[] args) {
        isLucky("123321");

    }

    static String isLucky(String ticketNumber) {

        boolean s = ticketNumber.charAt(0) + ticketNumber.charAt(1) + ticketNumber.charAt(2) == ticketNumber.charAt(3) + ticketNumber.charAt(4) + ticketNumber.charAt(5);
        if (s == true){
            System.out.println("Your ticket is lucky");
        }

        else
            System.out.println("Your ticket isnt lucky");
        return ticketNumber;
    
    }


}



