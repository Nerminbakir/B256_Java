package d26maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //HashMap arka planda nasil calisiyor?

        //HashMap’in varsayılan boyutu(kapasitesi) 16'dır (0 ila 15).
        // 16 adet "bucket" (kova) bulunacağı anlamına gelir.
        // Bu "bucket"lar, HashMap içindeki anahtar-değer çiftlerini tutar.
        // Bucket’in memory’de kapsadigi alan degiskendir.

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");
        capitals.put("Turkiye", "Istanbul");

    }
}