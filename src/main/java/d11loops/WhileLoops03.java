package d11loops;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın. interview sorusu
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;

        String original = String.valueOf(k); //"312"
        String reversed = "";
        //ters cevrilmis olani bunun icinde saklayacagiz

        int index = original.length() - 1; //son index'i aldik

        while (index >= 0) { //son index'ten baslattik
            reversed = reversed + original.charAt(index);

            index--;
        }
        System.out.println(reversed); //"213"

        if (original.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom degildir");
        }
    }
}
