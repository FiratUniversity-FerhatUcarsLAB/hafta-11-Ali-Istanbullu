/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [30.11.2025]
 * Aciklama:4.1 tamamlandı
 *
 *
 */
import java.util.Scanner;

public class Exercise4_1 {

     static String haftaGun(int haftaninGunu){
     
       switch(haftaninGunu) {
            case 1 : return "Pazartesi";
            case 2 : return "Sali";
            case 3 : return "Çarşamba";
            case 4 : return "Perşembe";
            case 5 : return "Cuma";
            case 6 : return "Cumartesi";
            case 7 : return "Pazar";
            default: return "Geçersiz Gün"; // 1-7 arası girilmezse çalışır
        }
     }
     static String yilAy(int yilinAyi){

        switch(yilinAyi) {
            case 1 : return "Ocak";
            case 2 : return "Şubat";
            case 3 : return "Mart";
            case 4 : return "Nisan";
            case 5 : return "Mayis";
            case 6 : return "Haziran";
            case 7 : return "Temmuz";
            case 8 : return "Ağustos";
            case 9 : return "Eylül";
            case 10 : return "Ekim";
            case 11 : return "Kasim";
            case 12 : return "Aralik";
            default: return "Geçersiz Ay"; // 1-12 dışı girilirse
        }
     }

     static void americaStandarti(int ayinGunu , int haftaninGunu , int yilinAyi , int yil , String haftaGunu , String yilinAy){

        if( (ayinGunu>0 && ayinGunu<32) && (haftaninGunu>0 && haftaninGunu<8) && (yilinAyi>0 && yilinAyi<13) && (yil>0 && yil<2026) ){

            System.out.printf("%s, %s %d, %d\n",haftaGunu,yilinAy,ayinGunu,yil);

        }
        else {

            System.out.println("Gecersiz");

        }

     }

     static void avrupaStandarti(int ayinGunu , int haftaninGunu , int yilinAyi , int yil , String haftaGunu , String yilinAy){

        if( (ayinGunu>0 && ayinGunu<32) && (haftaninGunu>0 && haftaninGunu<8) && (yilinAyi>0 && yilinAyi<13) && (yil>0 && yil<2026) ){

            System.out.printf("%d, %s %d, %s\n",ayinGunu,yilinAy,yil,haftaGunu);

        }
        else {

            System.out.println("Gecersiz");

        }

     }


    public static void main(String[] args) {
        
 //stack  hoop isboolen

   Scanner pp = new Scanner(System.in);

   System.out.print("Lutfen Ayin Gununu Giriniz (1-31) : ");
   int ayinGunu = pp.nextInt();
   System.out.print("Lutfen Haftanin Gununu Giriniz (1-7) : ");
   int haftaninGunu = pp.nextInt();
   System.out.print("Lutfen Yilin Ayini Giriniz (1-12) : ");
   int yilinAyi = pp.nextInt();
   System.out.print("Lutfen Yili Giriniz : ");
   int yil = pp.nextInt();

   String haftaGunu = haftaGun(haftaninGunu);
   String yilinAy = yilAy(yilinAyi);

   americaStandarti(ayinGunu,haftaninGunu,yilinAyi,yil,haftaGunu,yilinAy);
   avrupaStandarti(ayinGunu, haftaninGunu, yilinAyi, yil, haftaGunu, yilinAy);



    }
    
}


   
