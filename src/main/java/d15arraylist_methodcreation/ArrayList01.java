package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //Example 1: From a list with repeated elements, obtain a list with non-repeated elements.
        //           [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); //[J, a, v, a, v]

        List<Character> b = new ArrayList<>();

        //[J, a, v, a, v]
        for (Character w : a) {

            if (!b.contains(w)) { //b listinde donguden gelen eleman yoksa
                b.add(w); //b listine gelen elemani ekler
            }
        }
        System.out.println(b); //[J, a, v]

    }
}