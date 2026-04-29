class A{
    public void show(){
        System.out.println("Inside the show of A");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        //Here we are creating an inner class and changing teh functionality of A
        //Anonymous inner class
        A obj = new A(){
            public void show(){
                System.out.println("Inside new show of A");
            }
        };

        obj.show();
    }
}
