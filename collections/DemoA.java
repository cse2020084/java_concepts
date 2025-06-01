package collections;

import java.util.*;

public class DemoA{
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(19);
        l.add(33);
        l.add(20);
        l.add(91);


        l.sort((a,b) -> (a%10)-(b%10));
        System.out.println(l);


        
    }


}
