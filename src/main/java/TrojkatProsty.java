import java.util.Scanner;

public class TrojkatProsty {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie długości boków od użytkownika
        System.out.print("Podaj długość pierwszego boku: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj długość drugiego boku: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj długość trzeciego boku: ");
        double c = scanner.nextDouble();

        // Sprawdzenie, czy trójkąt jest prostokątny
        if (czyProstokatny(a, b, c)) {
            System.out.println("Trójkąt jest prostokątny.");
        } else {
            System.out.println("Trójkąt NIE jest prostokątny.");
        }

        scanner.close();
    }

    // Metoda sprawdzająca, czy trójkąt jest prostokątny
    public static boolean czyProstokatny(double x, double y, double z) {
        // Znalezienie najdłuższego boku (przeciwprostokątnej)
        double a = Math.min(x, Math.min(y, z));
        double c = Math.max(x, Math.max(y, z));
        double b = x + y + z - a - c; // Środkowa wartość

        // Sprawdzenie twierdzenia Pitagorasa (z tolerancją błędu dla liczb zmiennoprzecinkowych)
        return Math.abs(a * a + b * b - c * c) < 0.0001;
    }
}