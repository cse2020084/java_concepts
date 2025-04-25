package innerclasses;

public class Car {
    private String model;
    public void drive(){
        System.out.println("Car Drives Smoothly ");
    }

    public class Engine{
        
        public void start(){
            Car.this.model="XUV";
            System.out.println("Model name "+ Car.this.model);
            System.out.println("Engine Starts Running ");
        }

    }

    // can also create InnerClass object from here
    public void createObject(){
        Engine eng=new Engine();
        eng.start();
    }
}
