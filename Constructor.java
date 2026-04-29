//Constructor is used to assign default values to instance variables ike here name and age.
//By default construcotr is called when we initialize an object of that class
//Behind the scenes every class obj is when created it will by default call constructor even if we have not initialized a default constructor
class Human{
    private String name;
    private int age;

   public Human(){
    name = "Default_name";
    age = 16;
    }

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
}

  public class Constructor {
   public static void main(String[] args) 
   {
        Human obj = new Human();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    
   }
  }
