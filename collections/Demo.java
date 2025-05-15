package collections;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> obj=new ArrayList<Integer>();
        obj.add(28);
        obj.add(22);
        obj.add(65);
        obj.add(91);

        Collections.sort(obj);

        Iterator<Integer> e=obj.iterator();
        while(e.hasNext()) System.out.println(e.next()+" ");


        /*
         * Now I want more customize logic for sorting like on string size,
         * Now how to go through it for sorting
         * let me show you through Comparator
         */
        
        List<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Fig");

        Comparator<String> compareByStringSize=(i,j) -> i.length()>j.length()? 1: -1;
        Collections.sort(fruits,compareByStringSize);
        for(String s:fruits) System.out.println(s+" ");



    }
}
