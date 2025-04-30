package interfaces.abstractInterface;

public class Dog extends Animal {

    Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog is Barking");
    }

    @Override
    public void swim(){
        System.out.println("Dog swims..");
    }

    @Override
    public void fly(){
        System.out.println("Dog can not fly...");
    }


}
