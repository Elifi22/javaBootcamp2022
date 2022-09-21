public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sayi1=42;
        int sayi2=63;
        int sayi3=46;
        int enBüyük= sayi1;
        if (enBüyük<sayi2){
            enBüyük=sayi2;
        }
        if (enBüyük<sayi3){
            enBüyük=sayi3;

        }
        System.out.println("En büyük sayı"+ enBüyük);
    }
}