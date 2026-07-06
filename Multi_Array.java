import java.util.Scanner;
class Multi_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}