//Storing a student object in an array
class Student{
    int roll_no;
    String name;
}

public class Arrays2 {
    public static void main(String args[]){ 
        Student s1 = new Student();
        s1.name = "Sparsh";
        s1.roll_no = 1;

        Student s2 = new Student();
        s2.name = "Reena";
        s2.roll_no = 2;

        Student s3 = new Student();
        s3.name = "Pankaj";
        s3.roll_no = 3;

        Student arr[] = new Student[3];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name + " " + arr[i].roll_no);
        }

        //using enhance for loop
        for(Student s: arr){
            System.out.println(s.name + " " + s.roll_no);
        }

    }
}
