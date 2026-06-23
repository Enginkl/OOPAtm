import java.util.Locale;
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login = new Login();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bankamiza hosgeldiniz...");
        System.out.println("***********************");
        System.out.println("Kullanici Girisi");
        System.out.println("***********************");

        int girisHakki = 3;

        while(true){
            if(login.login(hesap)){
                System.out.println("Kullanici girisi basarili!");
                break;
            }
            else{
                System.out.println("Kullanici girisi basarisiz!");
                girisHakki--;
                System.out.println("Kalan giris hakki: " +  girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giris hakkiniz kalmadi...");
                return;
            }
        }

        String islemler = "1. Bakiye Goruntule\n"
                + "2. Para Yatirma\n"
                + "3. Para Cekme\n"
                + "Cikis icin herhangi bir tusa basin";

        do {
            System.out.println("***********************");
            System.out.println(islemler);
            System.out.println("***********************");

            String islem =  scanner.nextLine();
            if(islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye() + " TL");
            }
            else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutari girin: ");
                double tutar = scanner.nextDouble();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutari girin: ");
                double tutar = scanner.nextDouble();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                return;
            }

        }while(true);

    }
}
