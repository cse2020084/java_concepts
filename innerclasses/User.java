package innerclasses;

public class User {


    private final String name;
    private final int age;

    private User(Builder build){
        System.out.println("In User constructor");
        this.name=build.name;
        this.age=build.age;
    }
    
    public static class Builder{
        private  String name;
        private int age;
        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }



    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     // this.name = name;
    // }

    public int getAge() {
        return age;
    }

    // public void setAge(int age) {
    //     // this.age = age;
    // }
}
