package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        //ii)Space karakteri password'de olmasin (space haric her seyi sil)
        boolean spaceControl = pwd.replaceAll("[^ ]", "").length() == 0;
        //boolean spaceControl = !pwd.contains(" ");
        //boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty();
        //System.out.println("spaceControl = " + spaceControl);

        if (!spaceControl){
            System.out.println("Sifre bosluk icermemelidir");
        }

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        if (!upperCaseControl){
            System.out.println("Sifre en az bir buyuk harf icermelidir");
        }

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        if (!lowerCaseControl){
            System.out.println("Sifre en az bir kucuk harf icermelidir");
        }

        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("digitControl = " + digitControl);

        if (!digitControl){
            System.out.println("Sifre en az bir rakam icermelidir");
        }

        //ODEV 1: En az 1 sembol icermeli

        boolean symbolControl = pwd.replaceAll("[^\\p{Punct}]", "").length() > 0;
        //boolean symbolControl = pwd.replaceAll("[a-zA-Z0-9]", "").replace(" ","").length() > 0;
        //System.out.println("symbolControl = " + symbolControl);

        if (!symbolControl){
            System.out.println("Sifre en az bir sembol icermelidir");
        }

        //ODEV 2: Diger uyarilar.(Rakam harici) - yapıldı

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl;

        if (isValid){
            System.out.println("Sifre gecerlidir");
        } else {
            System.out.println("Sifre gecersizdir");
        }
    }
}
