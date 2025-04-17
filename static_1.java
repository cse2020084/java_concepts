public class static_1 {
    static String brand;
    int price;
    String model;

    void print(){
        System.out.println(brand+" has new  "+model+" of price "+price);
    }

    static void loadObject(static_1 st,String i){
        i="Hello";
        st.model="A1";
        brand="Hero";
        
        System.out.println(brand+" has new  "+st.model+" of price "+st.price+ " "+i);
    }

    static void printed(){
        System.out.println("Static method is invoked");
    }



    
    static{
        brand="Mercedes";
        System.out.println("Static block is invoked");
        printed();
    }

    void meth(static_1 st){
        // System.out.println("obj cretaed in  main method - "+st);
        static_1 s=new static_1();
        // System.out.println("obj cretaed in non static non main method - "+s);
        s.print();
    }



    public static void main(String [] args){
        System.out.println("Main method is invoked");
        static_1 st=new static_1();
        // static_1.brand="BMW";
        st.price=100000;
        st.model="X5";

        static_1 st1=new static_1();
        st1.price=200000;
        st1.model="A5";


        st.print();
        // st1.print();
        String  i="hi";
        static_1.loadObject(st,i);


        System.out.println(st.model+"  "+i);
        // st.print();


        // s.meth(s);

    }
}