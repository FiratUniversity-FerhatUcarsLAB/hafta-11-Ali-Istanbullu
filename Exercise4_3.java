/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [30.11.2025]
 * Aciklama:4.3 tamamlandı
 *
 *
 */
public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
//cıktı
//No, I wug.
//You wugga wug.
//I wug.
//stack diyagramı kutu gibi düşünün
|-------------------|
| ping()            |  
|-------------------|
| baffle()          |  
|-------------------|
| zoop()            | 
|-------------------|
| main()            |  
|-------------------|

