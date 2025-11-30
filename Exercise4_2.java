/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [30.11.2025]
 * Aciklama:4.2 tamamlandı
 *
 *
 */
public class Exercise4_2 { // 1

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { // 2
        zippo("rattle", 13); // 3 , 17
    }

    public static void baffle(String blimp) { // 9
        System.out.println(blimp); // 10
        zippo("ping", -5);// 11
    }

    public static void zippo(String quince, int flag) { // 4 , 12
        if (flag < 0) { // 5 , 13
            System.out.println(quince + " zoop"); // - , 14
        } else { // 6
            System.out.println("ik");// 7
            baffle(quince);// 8 , 15
            System.out.println("boo-wa-ha-ha"); // 16
        }
    }
}
//baffle ilk cagırıldıgında blimp = rattle idi

// cıktı 
//ik
//rattle
//ping zoop
//boo-wa-ha-ha 
// yapay zeka kullanılmadı

//27,23,22,14 birden fazla cağırıldı
