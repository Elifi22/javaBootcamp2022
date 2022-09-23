import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
       String [][] şehirler=  new String[3][3];
        şehirler[0][0]="İstanbul;";
        şehirler[0][1]="Bursa;";
        şehirler[0][2]="Bilecik;";
        şehirler[1][0]="Ankara;";
        şehirler[1][1]="Konya;";
        şehirler[1][2]="Kırklareli;";
        şehirler[2][0]="GaziAntep;";
        şehirler[2][1]="Şanlıurfa;";
        şehirler[2][2]="Diyarbakır;";
         for(int i =0;i<3;i++){
             System.out.println("*********");
             for (int j=0;j<3;j++){
                 System.out.println( şehirler[i][j]);

             }

        }





    }
}