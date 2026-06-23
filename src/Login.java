import java.util.Locale;
import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanici adinizi girin: ");
        kullanici_adi = scanner.nextLine();

        System.out.print("Parolanizi girin: ");
        parola = scanner.nextLine();

        if(kullanici_adi.equals(hesap.getKullanici_adi()) && parola.equals(hesap.getParola())){
            return true;
        }
        else{
            return false;
        }
    }
}
