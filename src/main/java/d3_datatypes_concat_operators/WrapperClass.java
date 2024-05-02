package d3_datatypes_concat_operators;

public class WrapperClass {
    public static void main(String[] args) {

        /*Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu.
        Bu yapiya wrapper class denir.

        Wrapper class’lar, Java'nın primitive veri türlerini object olarak
        temsil etmek için kullandığı class’lardir. Bu özellik, primitive veri türlerini koleksiyonlarda
        (örneğin ArrayList gibi) kullanabilmek için oldukça kullanışlıdır, çünkü Java'da koleksiyonlar
        sadece Object referans türlerini kabul eder.

        Ayrica en onemlisi girdigimiz veriler uzerinde method kullaniminin da yolunu acar.*/

        //wrapper'lar buyuk harfle baslar cunku class'tirlar

        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double

        int i = 12;
        //i.yazinca method acilmaz

        Integer k = 12;
        //k.yazinca methodlar acilir. Burasi class'tir.

        //Autoboxing - Unboxing

        /*Java'da primitive(ilkel) türler ve wrapper sınıfları arasında otomatik dönüşüm yapabilen
        autoboxing ve unboxing mekanizmaları vardır.

        1- Autoboxing, primitive bir türü otomatik olarak onun
        wrapper sınıfına çevirir. Örneğin, long'u Long'a dönüştürür.

        2- Unboxing ise tam tersi bir işlem yapar,
        Long'u long’a dönüştürür. (Wtapper'i primitive'e donusturur) Ikisi de otomatik gerceklesir.

        auto boxing ==> p w
        unboxing ==> w p
        */

        //Ornek 1 : primitive int’i wrapper Integer’a ceviriniz. ==> Autoboxing
        //Example 1: Convert primitive int to wrapper Integer

        int num = 13;
        Integer wrapperNum = num;

        //Ornek 2 : Wrapper Byte’i primitive byte’a ceviriniz. ==> Unboxing
        //Example 2: Convert Wrapper Byte to primitive byte

        Byte s = 19;
        byte primitiveS = s;

    }
}
