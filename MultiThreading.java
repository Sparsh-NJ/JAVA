//To make a class as thread just extend Thread class
//Inside a thread run() method tells the thread functionality

class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hi");
        }
}
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
}
}
public class MultiThreading {
    public static void main(String[] args) {
        A objA  = new A();
        B objB = new B();

        //Now I want both threads to run parallely. ie both loops run at the same time
        //When we do obj.start() -> This automatically calls the run() method of the thread
        //Therefore it is mandatory to have a run() method if we are extending Thread class

        objA.start(); // -> run() of A is called
        objB.start(); // -> run() of B is called

        //Both are now working parallely. ie multitasking achieved
        //But we see the output the sequence of output would be random as 
        //OS scheduler is the one which assigns which thread to come into play
        //here scheduler randomly assigns the thread 

        //we can suggest the scheduler priority of threads
        //Priority = [0 to 10] --> 0 least priority 10 max
        
        objB.setPriority(Thread.MAX_PRIORITY); //or we can use inbuilt methods to mention priorites
        objA.setPriority(1);
        //Above 2 methods only suggest scheduler about the priority, it is not necessary that scheduler will assign priorites 
        //as mentioned by  us

    }
}
