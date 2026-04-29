//Encapsulation means encapsulating all data within a class such that it is not accessible by other directly
//It is a good practice to make everything private inside a class
//To make them accessible to other classes we can use getters ans setters

class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    
    //Setter deep divevwhy we use this keyword? 
    
     public void setNam(String name){
        name = name; //If we do something like this it is highly possible that both name variables are local hence wrong result
    }

     public void setNm(String name){
        Human obj1 = new Human(); 
        obj1.name = name; // This will still not assign the correct value when called in main as main already have an object of human class
        //Here obj1 will be another different object, here in that object 2 we are having variable name in which we are assigning the value.
        //Therefore main will still not show correct result
    }

    //What to do ? we can pass the same obj of human class which is in main method in setter. That will work but lengthy
    //Therefore we can directltly use this keyword for this functionality

    //this.name tells whatever current object is calling the setter , fetch name of that. in our case it is the obj of human class in main method
    


    
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Sparsh");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
