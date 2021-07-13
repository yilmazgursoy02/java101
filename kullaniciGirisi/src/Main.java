import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sys_userName="patika",sys_password= "java123",userName,password,newPassword;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName =scanner.nextLine();

        System.out.print("Password : ");
        password =scanner.nextLine();

        if(sys_userName.equals(userName) && sys_password.equals(password)){
            System.out.println("Giriş Yaptınız...!");

        }else if (!password.equals("java123") ){
            System.out.println("Şifreniz Yanlış...\nŞifrenizi Değiştirmek İster misiniz ?\n1-EVET\n2-HAYIR ");
            int secim =scanner.nextInt();
            if (secim==1){
                Scanner scan =new Scanner(System.in);
                System.out.println("Yeni Şifrenizi Giriniz :");
                newPassword = scan.nextLine();
                while ( newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, Eski şifrenizle Aynı!\nYeni Şifrenizi Giriniz :");
                    newPassword = scan.nextLine();
                }
                password = newPassword;
                System.out.println("Şifre Başarılı oluşturuldu!");
            }
            if(secim==2){
                System.out.println("Sistemden çıkılıyor...");
            }
        }else
            System.out.println("Bilgileriniz Yanlış!");
    }
}
