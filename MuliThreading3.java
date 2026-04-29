//We can implement thread run methods using Runnable interface as well
//which is a Functional interface

// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Sparsh");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// } 


// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Nandrajog");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// } 

public class MuliThreading3 {
    public static void main(String[] args) {
        Runnable obj1 = () ->{
            for(int i=0;i<10;i++){
                System.out.println("Sparsh");
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Nandrajog");
                try {
                    Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        // obj1.start(); //Her we can see that Runnable interface does not have start method they
        //were coming from Thread class earlier

        Thread t1 = new Thread(obj1); // Thread accepts a runnable object . in our case obj1 and obj2 
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //I can reduce above code using lamda expressions as Runnable is a functional interface

    }
}
