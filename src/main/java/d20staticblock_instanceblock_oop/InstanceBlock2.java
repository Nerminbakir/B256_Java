package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {
    public int year;

    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
        //Buradaki kodu alip instance block icine yapistirdik
    }

    public InstanceBlock2(int year) {
        //Buradaki kodu alip instance block icine yapistirdik
        this.year = year;
    }
}
