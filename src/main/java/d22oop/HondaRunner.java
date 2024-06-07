package d22oop;

public class HondaRunner {
    public static void main(String[] args) {

        //Honda h = new Honda(); //HATA-'Honda' is abstract; cannot be instantiated
        //Honda abstract bir classtir. Bu class'tan object uretemezsiniz

        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo

        a.music(); //Pro

    }
}
