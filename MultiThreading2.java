class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Sparsh");
        //Suppose scheduler gives 1 milisecond for this thread but we wan this thread to wait 
        //10 milliseconds and then execute, in that case we can sleep() method
        try {
            Thread.sleep(10); //This will tell the scheduler wait for 10 ms then execute
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

//Adding sleep in both threads because I want threads to print output one after another not in random sequence
class B extends Thread{
    public void run(){

        for(int i=0;i<100;i++){
            System.out.println("Nandrajog");
         try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        //Result prints thread 1 output puts 1 in wait state then calls thread 2 output put 2 in wait state 
        //Near to alternate results, not exact results but alternate behaviour
    }
}
