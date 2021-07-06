import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  matematik, fizik, kimya, turkce, tarih,muzik;

        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik=scanner.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce=scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya=scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik=scanner.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih=scanner.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik=scanner.nextInt();

        int toplam=(matematik+turkce+kimya+fizik+tarih+muzik);
        double sonuc=toplam/6;
        System.out.println("Ortalamaniz: "+sonuc);

        String gectimi =(sonuc>60) ? "Tebrikler Geçtiniz...": "Kaldınız...";

        System.out.println(gectimi);





    }
}
