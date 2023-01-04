import java.util.Scanner;

public class kullanicigirişi {


    public static void main(String[] args) {
        String username, password, select1, select2;
        Scanner input = new Scanner(System.in);
        System.out.print("kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("şifrenizi giriniz: ");
        password = input.nextLine();
        if (username.equals("sanat") && password.equals("sever")) {
            System.out.print("giriş yaptınız");
        } else {
            System.out.print("şifrenizi sıfırlamak ister misiniz: ");
            select1 = input.nextLine();
            if (select1.equals("evet")) {
                System.out.print("yeni şifre giriniz: ");
                select2 = input.nextLine();
                if (select2.equals("sever")) {
                    System.out.print("şifre oluşturulmadı.lütfen tekrar deneyiniz");
                } else {
                    System.out.print("şifre oluşturuldu.");
                }
            }


        }
    }}



