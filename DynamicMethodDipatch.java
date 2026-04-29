class test{

}
class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{

    public void show(){
        System.out.println("In B");
    }
}
public class DynamicMethodDipatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); //calls the show method of A

        obj = new B();
        obj.show();//cals the show method of B

        //These dymaic methods are working because of inheritance, if no inheritance would be there 
        //We cannot reference a stack oject to another class like this

        //Here at compile time it is not decided which show() method will be called.
        //At run time it will be known , therefore it is called dynamic dispatch
    
        //We can also make object liek thiss
        A obj2 = new B(); //Parent reference to child in heap
        obj2.show();//calss show of B as obj2 points to B class

        test t = new test();
        // t = new A(); // This throw an error because inheritance is not there

        


    }
}
