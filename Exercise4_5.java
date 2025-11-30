/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [30.11.2025]
 * Aciklama:4.5 tamamlandı
 *
 *
 */
public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
//just for
//any not more 
//It's breakfast 
//!
|-----------------------------|
| Metot: zoop                 | 
|-----------------------------|
| Metot: clink                | 
|-----------------------------|
| Metot: main                 | 
|-----------------------------|
