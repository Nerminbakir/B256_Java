package d21oop;

public class Vehicle {

    /*Constructor Hiyerarsisi- Child class’tan bir object olusturdugunuzda constructor’lar
 en ustteki parent class’tan baslatilarak alta doğru calistirilir*/

    public Vehicle(){
        this("Honda", 2024, "Elektrikli");//3 -Object class'i cagirir
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){ //D
        super(); //Bu cagri object class'a yapilir
        System.out.println("Honda, 2024, Elektrikli");
    }

}