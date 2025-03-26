import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (czyPierwsza(liczba)) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }

        scanner.close();
    }

    // Metoda sprawdzająca, czy liczba jest pierwsza
    public static boolean czyPierwsza(int n) {
        if (n < 2) return false; // Liczby mniejsze niż 2 nie są pierwsze
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optymalizacja √n
            if (n % i == 0) {
                return false; // Jeśli n jest podzielne przez i, to nie jest pierwsza
            }
        }
        return true; 
    }
}




  
