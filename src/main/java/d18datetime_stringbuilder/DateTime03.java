package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime03 {
    public static void main(String[] args) {

        /*LocalTime Class’ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */
        //-------------------------
        //Anlik zamani nasil aliriz?

        //LocalTime kullanacagiz.
        //LocalTime, Java'nın java.time paketinde bulunan bir Class'tir ve sadece saat bilgisini
        //(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
        //Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.

        //Ornek 1: now(): Gecerli saat bilgisini alir.
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:29:07.181977

        //-----------------------
        //ornek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde
        // görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize
        // ve metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);

        //------------------------
        //Ornek 3: Tarih’i formatlayalim
        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM*d*y");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);

        //------------------------
        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.
        //https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2024-05-31

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam); //2024-05-30

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); //04:05:17.634077

        //----------------------Ekstra bilgi
        /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        //Tum zaman dilimlerini listeleyelim
        for (String w : zoneIds){
            System.out.println(w);
        }
        //Zaman dilimlerinin sayisini yazdiralim
        System.out.println("Toplam zaman dilimi sayisi : " + zoneIds.size());*/

        //IANA ?
        //----------------------

        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2024-05-30T22:15:46.203266

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt); //30 * May * 2024 - 10 : 19 ÖS

    }
}