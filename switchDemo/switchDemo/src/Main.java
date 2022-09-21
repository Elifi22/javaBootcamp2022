import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) {

        char grade='F';
        switch (grade) {
            case'A':
                System.out.println("Mükemmel,geçtiniz.");
            break;
            case 'B':
                System.out.println("çok iyi,geçtiniz");
                break;
                case 'c':
                    System.out.println("iyi,geçtiniz.");
                    break;
            case 'D':
                System.out.println("sorumlu,geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef,kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}