package d12loopsarrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

        Example 1:
               Valid Username="admin" and Password="pwd123".
               Get the username and password from the user.
               If the username and password are correct, print "Welcome to your account!" to the console.
               If the username or password is incorrect, prompt "Enter your username and password" 4 times.
               If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
        */

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int maxTries = 4; //Deneme sayisi bilgisi icin olusturduk. 4 hak var. Bu sayidan asagiya saydiracagiz

        do {
            System.out.println("Lutfen Username giriniz");
            String userName = input.next();

            System.out.println("Lutfen Password giriniz");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hos geldiniz");
                break;
            } else {
                counter++;
                if (counter == maxTries) {
                    System.out.println("Hesabiniz bloke olmustur");
                    break;
                } else {
                    //Kullaniciya kalan hak sayisini gosterelim
                    int remainingTries = maxTries - counter;
                    System.out.println("Yanlis kullanici adi ya da parola " + remainingTries + " hakkin kaldi.");
                }

            }
        } while (true); //sonsuz dongu olur. Icerden kirilmadigi surece calisacak


    }
}
