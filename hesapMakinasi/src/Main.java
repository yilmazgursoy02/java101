import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1,sayi2,secim;

        Scanner scanner =new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz :");
        sayi1= scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz :");
        sayi2= scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4.Bölme");
        secim =scanner.nextInt();
        switch(secim) {
            case 1:
                System.out.println("Toplam : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma : "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2 !=0){
                    System.out.println("Bölme : "+(sayi1/sayi2));
                    break;
                }
                System.out.println("Bir sayı 0'a bölünmez");
                break;
            default:
                System.out.println("Hatalı Seçim yaptınız.");
        }
    }
}
