package encapsulation;

public class ClassA {
    // public static void main(String[] args) {
    //     Human h=new Human();
    //     h.setName("John Doe");
    //     System.out.println("Name: " + h.getName());
    //     h.setAge(200);
    //     System.out.println("Age: " + h.getAge());
    // }

    public void  objectLoader(){
        Human h=new Human("Ram",900);
        h.setName("John Doe");
        System.out.println("Name: " + h.getName());

        // h.setAge(20);
        System.out.println("Age: " + h.getAge());
    }
}
