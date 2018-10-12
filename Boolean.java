package Tekwill;

public class Boolean {
    public static void main(String[] args) {
        /*
        AND = &&
        OR = ||
         */
        boolean afaraPloua = true;
        boolean afaraEFrig = true;
        boolean aziEMiercuri = true;

        boolean stauAcasa = aziEMiercuri && afaraEFrig && afaraPloua;

        if (stauAcasa == true) {
            System.out.println("Eu stau acasa");

        }else {
            System.out.println("Ma duc la perechi");
        }
        if (afaraPloua == true){
            System.out.println("afara ploua");
        }

    }
}
