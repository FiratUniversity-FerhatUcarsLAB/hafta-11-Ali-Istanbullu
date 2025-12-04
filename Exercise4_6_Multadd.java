/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [4.12.2025]
 * Aciklama:4.6 tamamlandı
 *
 *
 */

public class Multadd {
    static double expSum(double x){

        return x*(Math.exp(-x))+Math.sqrt(1-Math.exp(-x));

    }

    static double multadd(double a , double b , double c){

       
       return a*b+c;
       

    }

    public static void main(String[] args) {
        
      double islem1 = Math.sin(Math.toRadians(45)) + Math.cos(Math.toRadians(45)) / 2 ;

       double islem2 = Math.log10(10)+Math.log10(20);

       System.out.printf("%.3f\n",islem2);
       System.out.printf("%.3f\n",islem1);
       System.out.printf("%.2f\n",multadd(1.0, 2.0, 3.0));
        System.out.printf("%.2f\n",expSum(5));
    }
    
}
