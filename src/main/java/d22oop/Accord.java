package d22oop;

public class Accord extends Honda{

    //1- extends ile Honda'nin child'i yapildi
    //2-@Override yazildi. Paren'taki engine methodu alindi
    //3- abstract silindi
    //4- suslu parantez ile body eklendi


    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

}
