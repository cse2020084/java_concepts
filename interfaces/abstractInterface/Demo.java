package interfaces.abstractInterface;

public class Demo {
    public static void main(String[] args) {
        Service s=new Service();
        // Animal obj=new Dog("Tommy");

        // s.createAndUseObjects(obj);



        // for Animal1

        Animal1 obj1=new Duck("Ducky");
        s.createAndUseObjectsForOtherKind(obj1);
    }
}
