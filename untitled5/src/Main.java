import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
 int matematik,turkce,kimya,fizik,muzik;
 double ortalama;

 Scanner ders = new Scanner(System.in);

         System.out.println("Matematik Notunuzu Giriniz");
         matematik = ders.nextInt();

        System.out.println("Turkce Notunuzu Giriniz");
        turkce = ders.nextInt();

        System.out.println("Fizik Notunuzu Giriniz");
        fizik = ders.nextInt();

        System.out.println("Kimya Notunuzu Giriniz");
        kimya = ders.nextInt();
        System.out.println("Muzik Notunuzu Giriniz");
        muzik = ders.nextInt();

       if(matematik >= 0 && matematik <= 100 &&
               turkce >= 0 && turkce <= 100 &&
               fizik >= 0 && fizik <= 100 &&
        kimya >= 0 && kimya <= 100 &&
               muzik >= 0 && muzik <= 100)
       {
           ortalama=(matematik+kimya+turkce+muzik+fizik)/5;
           if (ortalama<= 55)
           {
               System.out.println("Sinifta Kaldiniz");

           }
           else
           {
               System.out.println("Sinifi Gectiniz");


       }
         /* else
           {
               System.out.println("GecersizNot");
           }*/

}
System.out.println("ORTALAMANIZ"+ortalama);


    }
}