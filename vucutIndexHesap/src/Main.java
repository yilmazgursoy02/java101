import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, vki;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz : (Örnek : 1,72) : ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu Giriniz : ");
        kilo = scanner.nextInt();

        vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

    }
}
