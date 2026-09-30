//Constructor is used to assign default values to instance variables ike here name and age.
//By default construcotr is called when we create an object of that class
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
        //Constructor is called at this moment only when we create a new object of Human class
        Human obj1 = new Human();

        obj1.setAge(23);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());

        Human obj2 = new Human();

        obj2.setAge(25);
        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());

        if(obj1 == obj2) System.out.println("same");
        else System.out.println("Not same");
    
   }
  }
