package stream_api;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;

public class ForEach {
    
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(4,2,9,6);
        Stream<Integer> s1=l.stream();
        Predicate<Integer> pre= new Predicate<Integer>() {
            public boolean test(Integer f) {
                return f%2==0;
            }
            
        };
        
        Stream<Integer> s2=s1.filter(pre)
        .map(m ->  m*2);    

        s2.forEach(System.out::println);

    }

}
