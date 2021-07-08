import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Üçret Tutarını Giriniz : ");
        tutar=scanner.nextDouble();

        if(tutar > 0 && tutar < 1000){

            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);

        }
        else
        {
            kdvOran=0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);
        }
    }
}
