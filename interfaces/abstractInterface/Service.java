package interfaces.abstractInterface;

public class Service {
    
    public void createAndUseObjects(Animal obj){        
        obj.makeSound();
        obj.eat();
        obj.swim();
        obj.fly();
    }


        
    public void createAndUseObjectsForOtherKind(Animal1 obj){        
        obj.makeSound();
        obj.eat();

        if(obj instanceof Swimmable){
            Swimmable swimObject=(Swimmable) obj;
            swimObject.swim();
        }
        // obj.swim(); //not use this way since Animal1 does not implement interfaces
        
        if(obj instanceof Flyable){
            Flyable flyObj=(Flyable) obj;
            flyObj.fly();
        }
    }
}
