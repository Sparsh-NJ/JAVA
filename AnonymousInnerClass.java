class A{
    public void show(){
        System.out.println("Inside the show of A");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        //Here we are creating an inner class in 'AnonymousInnerClass' class and changing the functionality of A for that object
        //Anonymous inner class, as inner class has no name
        A obj = new A(){ //This line specifies that we are not creating objects of class A but are creating objects of anonymous inner class
            public void show(){
                System.out.println("Inside new show of A");
            }
        };

        //Both prints inside new show of A
        obj.show();
        obj.show();
    }
}
