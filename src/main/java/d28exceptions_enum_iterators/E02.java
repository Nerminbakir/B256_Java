package d28exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

        //Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
        // Bu seferde try-catch kullanalim

        try {

            FileInputStream fis = new FileInputStream("src/main/java/d27exceptions/file.txt");
            int k = 0; //Okunan degerleri bunun icinde saklayacagiz

            while ((k = fis.read()) != -1) {
                System.out.print((char) k); //type casting
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
