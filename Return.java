package Tekwill;

public class Return {

    String getStringFromArray(String[] list, int x){

        if (x < list.length && x >= 0) {
            return list[x];
        } else {
            return "No Solution!!!";
        }

    }

    public static void main(String[] args) {
        Return retturn = new Return();
        String[] listaMea = {"Jora", "Ion", "Dorin", "Andrie"};
        System.out.println(retturn.getStringFromArray(listaMea, 0));
        System.out.println(retturn.getStringFromArray(listaMea, 6));
        System.out.println(retturn.getStringFromArray(listaMea, 2));
    }

}
