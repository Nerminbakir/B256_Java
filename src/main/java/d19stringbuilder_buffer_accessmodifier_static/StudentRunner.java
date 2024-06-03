package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student class'tan bir tane instance olusturalim

        Student ali = new Student();

        System.out.println(ali.stdName); //Ali Can
        System.out.println(ali.email); //alican@gmail.com //default, ayni paketten erisilebilir
        System.out.println(ali.address); //Istanbul //protected, ayni paketten erisilebilir
        System.out.println(ali);

    }
}
