
class A{
    public void show(){
        System.out.println("inside the show of A");
    }

    //class inside a class
     class inner{
        public void showIn(){
            System.out.println("Inside show of inner");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        // A.inner obj = new A.Inner();     //wrong way to call inner class methods   
        A obj = new A();
        obj.show();
        A.inner obj2 = obj.new inner();
        obj2.showIn();
    }
}
