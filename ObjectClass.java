//Every class in java by default extends the Object class in java

class Laptop{
    public int model;
    public String name;

    public String toString(){
       return "Laptop details are :- " + model + " " + name ;
    }
}
public class ObjectClass {

    public static void main(String args[]){
        Laptop obj = new Laptop();

        //By default when we try to print an object then it calls the toString() method of Object class
        //This prints the class name + hexadecimal format of hashcode
        System.out.println(obj);
        System.out.println(obj.toString()); //Same output as above

        //If we define toString method in laptop class in that case method overriding will come into picture
        //Laptop class toString() method will be called

        obj.model = 16;
        obj.name = "Asus Vivobook";
        System.out.println(obj);
    }
    
}
