class Mobile{
    private int price;
    private String name;
    private static String ram; 

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getRam() {
        return ram;
    }

    public static void setRam(String ram) {
        Mobile.ram = ram;
    }

    //static block is declared in order to initialize a static instance only once.This will be called only once
    static{
        ram = "16GB";
        System.out.println("Inside static block");
    }
    Mobile(){
        price = 200;
        name = "Iphone";
        // ram = "16GB";//Ram is defined as static , why we need to initialize again and again . It must be initialized only once.
        System.out.println("Inside constrctor mobile");
    }
}
public class staticBlock {
    public static void main(String[] args) {
        //These 2 objects will call constructor total 2 times but static block only once
        Mobile mob1 = new Mobile();
        Mobile mob2 = new Mobile();    
    }
}


    //If we see the result the static block will be called first even before constructor is called.
    //This is beacuse when we create an object of a class. first the class is loaded by a class loader then object is created in jvm.
    //This class loading is done only once per class while can create objects multiple times.
    //Static block is a part of class loader , thats why it is called only once and even before constructor.

    //What if we want to load the class? But we are not creating any object?
    //In this case JAVA has a Class named "Class" which has class loading method
    // Class.forName("Mobile"); This will load the class Mobile even if we dont create an object and static block will be called
   
