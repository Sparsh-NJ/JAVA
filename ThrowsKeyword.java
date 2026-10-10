class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo"); //This loads the class Demo if available , but here dont have a class demo
        //It will throw class not found exception. We can add a try and catch block here. But what if we want the parent caller to handle the exception
        //In that case we can use throws keyword with the method
    }
}
public class ThrowsKeyword {

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
           System.out.println("Error while calling throw function:-  " + e);
        }
    }
}
