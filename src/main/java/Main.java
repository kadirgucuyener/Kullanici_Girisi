import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, passwordChange;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("kadirgucuyener") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Parolanız Hatalı");
            System.out.println("Şifrenizi sıfırlamak için (evet/hayır) yazınız.");
            passwordChange = input.nextLine();

            if (passwordChange.equals("Evet")) {
                System.out.println("Yeni Şifrenizi Giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Eski şifrenizi kullanıyorsunuz, şifreniz oluşturulamadı.");

                }
                else {
                    System.out.println("Şifreniz oluşturuldu.");
                }
            }
            else {
                System.out.println("Tekrar Deneyiniz");
            }

        }

    }
}
