abstract class A{
    public abstract void show();
    public abstract void config();
}

public class AdvanceAnonyInnerClass {
    public static void main(String[] args) {

        //We know that we can't create the object of abstract classes
        //Here we are creating object of inner class 
        A obj = new A(){
            public void config() {
              System.out.println("inside config");
                
            }
            public void show() {
               System.out.println("Inside show");
                
            }
        };

        obj.show();
        obj.config();
    }
}
