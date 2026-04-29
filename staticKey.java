
class Mobile{

    private static String name; //This will keep name same across all objects. Memory will also be assigned once for static keyword
    private int model;
    private int price;

    public String getName() {
        return name;
    }

    //static instances should be called by class name itself , thats a good practice
    public void setName(String name) {
        Mobile.name = name;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //Method to print all values
    //Here we can see that in side a non static method we can call a static keyword --> name
    public void show(){
        System.out.println(name + " " + model + " " + price);
    }

    //Here we cannot use non static instances of the class in a static method 
    // name is static therefore acceptable inside static method , model and price are not accepted 
    //We need to specify the object for which model and price need to be printed
    public static void show2(Mobile obj1){
        System.out.println(name + " "+ obj1.model + " " + obj1.price);
    }
    //we can directly call a static method using the class name in the calling class
    
}
public class staticKey {
    //Here every object have different memory in heap and have different name. Suppose we want to make the name instance same in every object
    //of that class, then we can use static keyword.
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.setName("Iphone");
        obj1.setModel(1);
        obj1.setPrice(1000);  

        Mobile obj2 = new Mobile();
        obj2.setName("Samsung");
        obj2.setModel(2);
        obj2.setPrice(800);

        Mobile obj3 = new Mobile();
        obj3.setName("Nokia");
        obj3.setModel(3);
        obj3.setPrice(500);

        obj1.show();
        obj3.show();//This shows obj2 data
        obj2.show();//This shows obj1 data
        //Therefore when we use Mobile.show2() which object data to show?? Therefore static methods only take static instances if the class
        Mobile.show2(obj1);
    }
}


//Why main method is always static?
//Suppose main method is not static, and here it is inside staticKey class. So to invoke that method we first need to create 
//an object of class staticKey and then call the Main method 
//but we all know that in java execution point starts from main therefore we cannot create object of class staticKey before execution of program
//It is kind of a deadlock , so main is always static