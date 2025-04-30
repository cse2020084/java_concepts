package interfaces.abstractInterface;
public abstract class Animal implements Swimmable,Flyable {
    String name;

    Animal(String name){
        this.name=name;
    }
    abstract void makeSound();

    public void eat(){
        System.out.println("Animal is eating ");
    }
}