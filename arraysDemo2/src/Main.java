public class Main {
    public static void main(String[] args) {
        String Kahve1 = "Mocaa";
        String Kahve2 = "Latte";
        String Kahve3 = "Espresso";
        String Kahve4 = "Capuccıno";

        System.out.println(Kahve1);
        System.out.println(Kahve2);
        System.out.println(Kahve3);
        System.out.println(Kahve4);


        System.out.println("---------------------");
        String[] Kahveler = new String[4];
        Kahveler[0] = "Mocaa";
        Kahveler[1] = "Latte";
        Kahveler[2] = "Espresso";
        Kahveler[3] = "Capuccıno";

        for (int i = 0; i < Kahveler.length; i++) {
            System.out.println("*********************");
            {


            }
            for (String Kahve : Kahveler) {
                System.out.println(Kahve);

            }
        }
    }
}