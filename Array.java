public class Array {
    public static void main(String[] args) {
        int arr[] = new int[4]; //By default all zero values
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }  

        //Enhaced for loop for 1-D array
        System.out.println("Enhaced loop starts");
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println("2D array starts");
        // //2D array
        int arr2[][] = new int[4][3];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }

         System.out.println("Number of rows in array 2 are " + arr2.length);

        //Enhanced for loop to print arrays
        for(int n[]:arr2){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}
