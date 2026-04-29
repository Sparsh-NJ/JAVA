class A{
    public void show1(){
        System.out.println("Inside show of A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("Inside the show of B");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        A obj = new B(); //Upcasting safe
        // obj.show2() //This is not availbe here as obj is of type A

        // B obj = (B) new A(); //can't do this will throw an error in runtime
        
        //Downcating
        B obj2 = (B)obj; //This works fine as obj is pointing to B object actually.Therefore can be typecasted back to B
        obj2.show1();
        obj2.show2();
        //Both shows are available here as obj2 is of type B and B extends A. Therefore both methods are available

    }
}
