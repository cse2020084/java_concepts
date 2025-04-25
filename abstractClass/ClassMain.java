package abstractClass;

public class ClassMain {
    public static void main(String[] args) {
        WagonR obj=new AdvWagonR();
        obj.playMusic();
        obj.canFly();
        obj.setTitle("WagonR SUV");
        String title=obj.getTitle();
        System.out.println("Title is "+title);
        obj.drive();
    }
    
}
