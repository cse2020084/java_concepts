package collections;

import java.util.*;

/*
 * thumb case is if you want sorting simple by only one order for entire use case
 * and you can control class implementation/modification 
 * (not prefer if you want to have flexible sorting logic in built in class like Integer, String..)
 * 
 * then go for Comparable
 * 
 * else if you want more control and fleible in customzation of sorting on more than one order
 * and you can not or won't control class implementation
 * 
 * then go for Comparator
 */

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student that) {
        return this.age > that.age ? 1:-1;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }




}

public class Comparators {
    public static void main(String[] args) {
    

        Comparator<Student> compareById=new Comparator<Student>() {
            public int compare(Student a, Student b){
                return a.id>b.id?1:-1;
            }
        };

        /*
         * you can use multiple comparator, see one with lambda expression
         * as you know comparator is a functional interface
        */

        Comparator<Student> compareByName= (i,j) -> i.name.charAt(0)>j.name.charAt(0)?1:-1;


        List<Student> l=new ArrayList<Student>();
        l.add(new Student(1,"Raj",30));
        l.add(new Student(2,"Mani",24));
        l.add(new Student(3,"Shiv",51));
        l.add(new Student(4,"John",23));


        /*
         * Now try to  switch and run sort with and without com , then you will see how c 
         */
        Collections.sort(l);
        Iterator<Student> i=l.iterator();
        while(i.hasNext()) System.out.println(i.next()+" ");

        

    }
}
