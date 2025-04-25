package abstractClass;

public abstract  class Car {
    private  String title;

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void drive(){
        System.out.println("Car is Driving");
    }
    
    public abstract void playMusic();
}


