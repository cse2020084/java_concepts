package innerclasses;

public class Animal {
    public void eats(){
        System.out.println("Animal is eating Grass ");
    }
}

abstract class Birds{  // even though it is abstract, we can instantinate but only after having anonymus inner class
    public abstract void eats();
}

class Demo{
    public static void main(String[] args) {
        Animal a=new Animal(){
            public void eats(){
                System.out.println("Animal are eating Crops");
            }

            public void sound(){
                System.out.println("Animals are meowing ");
            }
        };

        //above here is anonymous inner class, we create it when we had to override few method only.
        a.eats();
        //also anonymous classes can not add 
        // a.sound();


        Birds b=new Birds()
        {
            public void eats(){
                System.out.println("Bird is eating Grains ");
            }
        };

        b.eats();
    }
}
