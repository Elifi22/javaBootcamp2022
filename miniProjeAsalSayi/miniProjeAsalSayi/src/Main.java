public class Main {
    public static void main(String[] args) {
            int number = 25;
            if (number == 1) {
                System.out.println("Sayı asal değildir.");
                return;
            }
            if (number < 1) {
                System.out.println("Geçersiz sayı girdiniz.");
                return;
            }
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            isPrime = false;
            if (isPrime) {
                System.out.println("Sayı asaldır.");
            } else {
                System.out.println("Sayı asal değildir.");
            }

        }
    }

