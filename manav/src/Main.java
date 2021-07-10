import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut= 2.14,elma= 3.67,domates= 1.11,muz= 0.95, patlican= 5.00 ;
        int armutKilo, elmaKilo, domatesKilo, muzKilo,patlicanKilo;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKilo=scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo=scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo=scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo=scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo=scanner.nextInt();

        double total =(armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);

        System.out.println("Toplam Tutar : "+total);

    }
}
