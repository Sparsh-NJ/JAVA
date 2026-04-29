public class Array {
    public static void main(String[] args) {
        int arr[] = new int[4]; //By default all zero values
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }  

        System.out.println("2D array starts");
        // //2D array
        int arr2[][] = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }

        //Enhanced for loop to print arrays
        for(int n[]:arr2){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}
