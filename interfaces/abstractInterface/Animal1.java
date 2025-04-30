package interfaces.abstractInterface;

public abstract class Animal1 {
    String name;

    Animal1(String name){
        this.name=name;
    }
    abstract void makeSound();

    public void eat(){
        System.out.println(this.name+" is eating ");
    }
}
