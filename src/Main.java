import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matNot, fizikNot , kimyaNot, turkceNot, tarihNot, muzikNot;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz Giriniz :" );

        matNot = input.nextInt();

        System.out.print("Fizik Notunuz Giriniz :");

        fizikNot = input.nextInt();

        System.out.print("Kimya Notunuz Giriniz :");

        kimyaNot = input.nextInt();

        System.out.print("Türkçe Notunuz Giriniz :");

        turkceNot = input.nextInt();

        System.out.print("Tarih Notunuz Giriniz :");

        tarihNot = input.nextInt();

        System.out.print("Müzik Notunuz Giriniz :");

        muzikNot = input.nextInt();

        int toplam = (matNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot);

        double sonuc = toplam / 6;

        int gecerNot = 60;


        boolean  basariDurumu = sonuc >= gecerNot;

        String str = basariDurumu ? "Başarılı" : "Başarısız";


       System.out.println("Ortalamanız : " + sonuc);
       System.out.print(str);



    }
}