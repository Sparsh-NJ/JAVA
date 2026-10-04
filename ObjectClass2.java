//Every class in java by default extends the Object class in java

class Laptop{
    public int model;
    public String name;

    public String toString(){
       return "Laptop details are :- " + model + " " + name ;
    }

    //Method overriding will happen , Object class method will not be called
    public boolean equals(Laptop obj){
        if(this.name.equals(obj.name) && this.model == obj.model)
            return true;
        else 
            return false;
    }
}
public class ObjectClass2 {

    public static void main(String args[]){
        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop();

        obj1.model = 16;
        obj1.name = "Asus Vivobook";
        
        obj2.model = 16;
        obj2.name = "Asus Vivobook";

        //.equals() method in String class compares the actual string value ie content.
        System.out.println(obj1.name.equals(obj2.name));

        //.equals() method of Object class compares the reference equality.
        System.out.println(obj1.equals(obj2));

        //If we implement our own .equals() method in the class then we can make .equals() behave as 
        //value equality check for our implementation
    }

    //A better appraoch is to right click -> source action -> generate hashcode() & equals() and toString() method. 
    //IDE provides a better approach for that
    
}
