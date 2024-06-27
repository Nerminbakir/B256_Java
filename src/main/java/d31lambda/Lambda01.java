package d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //printElementsExceptStartsWithE(myList); //Ali Yusuf Zeynep Mustafa
        //printDistinctElementsLengthLessThanFive(myList); //Ali Elif
        //List<String> donusList = getElementLengthMoreThanFiveWithUpperCase(myList);
        //System.out.println(donusList); //[ZEYNEP, MUSTAFA]
        //printElementsLengthLessThanFiveUniqueLowerCase(myList); //ali elif
        //printElementsUniqueToUpperCaseSorted(myList); //ALİ ELİF MUSTAFA YUSUF ZEYNEP
        printElUniqueLowerCaseSortWithLength(myList); //ali elif yusuf zeynep mustafa


    } //main disi
    //-----------------------
    //ornek 9: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 9: Create a method that prints to the console all items in a list that do not start with the letter "E".

    public static void printElementsExceptStartsWithE(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.print(t + " "));

    }

    //-----------------------
    //ornek 10: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız)
    // elemanları konsola yazdıran bir metod yazınız.
    //example 10: Write a method that prints all unique (non-repetitive) elements with less than 5
    // characters in a List<String> to the console.

    public static void printDistinctElementsLengthLessThanFive(List<String> myList) {

        myList.stream().distinct().filter(t -> t.length() < 5).forEach(t -> System.out.print(t + " "));

    }

    //-----------------------
    //Örnek 11:Bir List<String> içinde karakter sayısı 5'ten fazla olan tüm elemanları büyük harfe çevirip,
    // bu elemanları yeni bir liste olarak döndüren bir metod yazınız.
    //Example 11:Write a method that converts all elements with more than 5 characters in a List<String>
    // to uppercase and returns these elements as a new list.

    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> myList) {
/*        return myList.
                stream().
                filter(t-> t.length() > 5).
                map(t->t.toUpperCase()).
                collect(Collectors.toList());*/

        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }

    //ARASTIRMA ODEVI: myList ile başlayan iki ayrı satır, tek bir metod içinde olabilir mi?

    //-----------------------
    //Örnek 12:Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz elemanları
    // küçük harflere çevirip doğal sıralamaya göre konsola yazdıran bir metod yazınız.
    //Example 12: Write a method that converts all unique elements with less than 5 characters
    // in a List<String> to lowercase letters and prints them to the console according to their natural order.

    public static void printElementsLengthLessThanFiveUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    //-----------------------
    //Örnek 13:Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
    // sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.
    //Example 13: Write a method that makes all the elements in a List<String> unique,
    // converts them to uppercase letters, and prints them to the console in alphabetical order.

    public static void printElementsUniqueToUpperCaseSorted(List<String> myList) {
        myList.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //-----------------------
    //Örnek 14:Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
    // ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.
    //Example 14: First make all the elements in a List<String> unique, then convert them to lowercase
    // letters and write
    // a method that sorts the elements from smallest to largest according to their length and
    // prints them to the console.

    //Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
    // belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

    //sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
    // göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
    // sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){

/*        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));*/

        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);

    }
}