//Let increment method is the shared resource between tro threads
class Counter{
    int cnt = 0;
    public synchronized void  increment(){
        cnt++;
    }
}
public class MultiThreading4 {
    public static void main(String[] args) throws InterruptedException {

        Counter cnt = new Counter();

        //Here both threads are accessing the same resource at the same time , which can cause glitch or unknown outputs
        //This condition is called as Race condition
        //To remove race condirion we can use synchorized keyword with the shared resource

        Runnable obj1 =() ->{
                for(int i=0;i<1000;i++){
                    cnt.increment();
                }
            }
        ;

        Runnable obj2 =() ->{
                for(int i=0;i<1000;i++){
                    cnt.increment();
                }
            }
        ;

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //In earlier multithreading examples we were only doing tasks inside threads
        //But here this sysout statement is part of main method not any thread 
        //Therefore it will also run independently once the threadsa are started
        //Therefore we must join the threads back to main 
        //Which mentions that let thread complete the execution after that main will do its task
        t1.join();
        t2.join(); //This join method throws an error , for now for code simplicity we are 
        //using throws keyword to let the caller know that he will handle this exception
        
        System.out.println(cnt.cnt);
        //output is correct 2000 as now Each thread access the counter one at a time
        

        //different stages of threads

        //new ->runnable -> running -> waiting -> dead

        //new -> means new thread created

        //runnable -> means not running currently but waiting for scheduler to get the thread in running stage
        
        //running --> running stage
        
        //waiting -> Thread waits for a specified amount of time
        //to put a thread in waiting stage we can use sleep() or wait() methods
        //only difference between sleep and wait is that for wait() method we need to call notify method as well
        //which puts state of a thread to runnable
        
        //dead -> means to stop the thread execution completely
        //can use stop() method
    }
}
