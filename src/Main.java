import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu yaz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu gir: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu gir: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu gir: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu gir:");
        tarih = input.nextInt();

        System.out.print("Müzik notunu gir: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double result = toplam / 6;
        String res = result >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(""+res);
    }
}