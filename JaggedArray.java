public class JaggedArray {
    public static void main(String[] args) {

        //We can have arrays which have rows fixed but column for each row different. This is called as jagged array

        int arr[][] = new int[3][];

        //individually declare the column size of each row
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[5];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random() * 10);    // This helps in assigning random values
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
