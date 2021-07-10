import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r =scanner.nextInt();

        System.out.print("Dairenin merkez açısını  giriniz : ");
        a = scanner.nextInt();

        /* Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         𝜋 sayısını = 3.14 alınız.
           Formül : (𝜋 * (r*r) * 𝛼) / 360 */

        double alan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı : " + alan);

    }
}
