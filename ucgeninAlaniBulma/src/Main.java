import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kenar1,kenar2,kenar3,u;
        double alan;

        System.out.print("1. Kenarı giriniz: ");
        kenar1 = scanner.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = scanner.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        kenar3 = scanner.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin alanı = " + alan);

    }
}
