package encapsulation;

public class Human {
    private String name;
    private int age;

    //getter for name
    public String getName() {
        System.out.println("The name is "+this.name);
        //this keyword is used to refer the current class instance variable
        return this.name;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for age
    public int getAge(){
        System.out.println("The age is "+this.age);
        return this.age;
    }

    //setter for age
    public void setAge(int age){
        if(age>0 && age<120){
            this.age = age;
        }else{
            System.out.println("Please enter a valid age");
        }
    }

    
}
