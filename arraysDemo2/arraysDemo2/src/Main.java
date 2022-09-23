public class Main {
    public static void main(String[] args) {
        String kahve1 = "Espresso";
        String kahve2 = "Latte";
        String kahve3 = "Mocca";
        String kahve4 = "Capuccıno";

        System.out.println(kahve1);
        System.out.println(kahve2);
        System.out.println(kahve3);
        System.out.println(kahve4);

        System.out.println("----------");


        String[] kahveler = new String[4];
        kahveler[0] = "Espresso";
        kahveler[1] = "latte";
        kahveler[2] = "Mocca";
        kahveler[3] = "Capuccıno ";
        for (String s : kahveler) {

            System.out.println(s);


        }


    }
}


