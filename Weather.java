package Tekwill;

public class Weather {
    public static void main(String[] args) {
        String [] Months = {"January", "February", "March", "Aprill", "May", "June", "July", "August", "September", "Octoboer", "November", "December"};
        int [] Weather = {-4, -2, 5, 10, 16, 20, 21, 25, 29, 18, 15, 9, 0};
        for (int i = 0; i < Months.length; i++) {
            Months[i]= Months[i]+ " " + Weather[i];

            System.out.println(Months[i] + "°C " + "or " +  (Weather[i] + 273) + " K" );


        }

    }
}
