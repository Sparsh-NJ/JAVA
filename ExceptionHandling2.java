public class ExceptionHandling2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 4;

        int arr[] = new int[5];
        for(int m=0;m<arr.length;m++){
            arr[m] = m+1;
        }

        //lets try to add 2 different exceptions like accessing array out of bounds

        try{
            j = j/i;
            arr[5] = 9; // Execution will also not come here as above thrown an exception
            System.out.println("After arithmetic excwption"); //this statement will not get executed if above statement throw an exception
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero " + e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Cannot access an elemnt out of bounds " + e);
            //When er are not sure which exception will be there , we can use Exception class which is a parent class
        }catch(Exception e){ 
            System.out.println("Not sure about the exception");
        }

        System.out.println("bye");

        //Exception class extends Throwable class in java 

        //Hierarchy of exceptions

//        Object
//          |
//      Throwable
//     /         \
//  Error       Exception
//   |          /       \
//   |    RuntimeException  (Checked Exceptions)

//   |          |               |
//   |    (Unchecked            |-- IOException
//   |     Exceptions)          |-- SQLException
//   |          |               |-- ClassNotFoundException
//   |    |-- NullPointerException
//   |    |-- ArithmeticException
//   |    |-- ArrayIndexOutOfBoundsException
//   |

//   |-- OutOfMemoryError
//   |-- StackOverflowError
//   |-- VirtualMachineError


//Runtime exceptions are unchecked exceptions as compiler will not force us to handle those, on the other hand remaining exceptions
//Needs to be checked ie forced by compiler 

    }
}
