class A{
    public void show() throws Exception{
        Class.forName("Demo"); //This loads the class Demo if available , but here dont have a class demo therefore it comes under checked exception
        //class not found . We can add a try and catch block here. But what if we want the parent caller to handle the exception
        //In that case we can use throws keyword with the method
    }
}
public class ThrowsKeyword {

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
           System.out.println("Error while calling throw function + " + e);
        }
    }
}
