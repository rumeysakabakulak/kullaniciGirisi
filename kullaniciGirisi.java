import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
            String userName , password , newPassword ;
            int select ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Parolanız : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yapıldı.");
        }else if (userName.equals("patika") && ! password.equals("java123")){
            System.out.println("Şifrenizi Yanlış Girdiniz");
            System.out.println("Şifrenizi Sıfırlamak İster misiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();
        switch (select){
            case 1:
                System.out.println("Yeni Şifrenizi Giriniz" + inp.nextLine());
                newPassword = inp.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.print("Şifre oluşturulamadı, lütfen yeni bir şifre giriniz.");
                    }else {
                        System.out.print("Şifre Oluşturuldu"); } break;
            case 2:
                System.out.print("Tekrar giriş yapmayı deneyin."); break;
        }

        }



        }




    }

