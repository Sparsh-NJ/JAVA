//String buffer is used to create mutable strings in java
public class Buffer {
    public static void main(String[] args) {
       StringBuffer s = new StringBuffer("Sparsh");
       s.append(" Nandrajog"); //append can be used to change the same string object 
       s.deleteCharAt(2); // deletes a char at an index
       System.out.println(s);

       //String builder is same as string buffer for creting mutable strings only difference between them is 
       //StringBuffer is Thread safe and String builder is not 
    }
}
