package interfaces.abstractInterface;

public class Duck extends Animal1 implements Swimmable,Flyable {
    Duck(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+" is flying");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void makeSound(){
        System.out.println("Duck quaks");
    }
}
