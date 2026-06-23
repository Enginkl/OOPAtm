public class Hesap {
    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public Hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(double tutar){
            bakiye += tutar;
            System.out.println("Para yatirma islemi basarili! Bakiyeniz: " + bakiye + " TL");
    }

    public void paraCek(double tutar){
        if(tutar > bakiye){
            System.out.println("Bakiyeniz yetersiz! Bakiyeniz: " + bakiye + " TL");
        }
        else{
            bakiye -= tutar;
            System.out.println("Para cekme islemi basarili! Bakiyeniz: " + bakiye + " TL");
        }
    }
}
