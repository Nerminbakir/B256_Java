package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
        //Engine e = new Engine(); Soyut bir yapidan object uretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        //Brake s5 = new AudiS5();
        //s5.abs();

        //a4.run(); //Audi A4 havayastigi calistirir
        ((Engine)a4).run(); //Audi A4 havayastigi calistirir
        //Engine interface'inden gelen run() methodu calisti

        //Engine.price = 5000; HATA

        System.out.println(Engine.fiyat); //300
        System.out.println(AC.fiyat); //200
        System.out.println(Brake.fiyat); //100

        Engine.speed(); //Saatte 300km-Interface uzerinden eristik cunku static
        a4.power(); //200HP-object uzerinden eristik

    }
}
