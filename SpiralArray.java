import java.util.Scanner;
class SpiralArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        if (row == 0 || col == 0){
            System.out.println("Row or column cannot be 0");
        }
        else{
            int[][] arr = new int[row][col];

            System.out.println("Enter the elements of the array: ");
            
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int rmin = 0, cmin = 0, rmax = row - 1, cmax = col - 1;
            int count = 0;

            System.out.println("Spiral pattern:");

            while (count < row * col){
                //Top Left to right
                for (int n = cmin; n <= cmax && count < row * col; n++){
                    System.out.println(arr[rmin][n] + " ");
                    count++;
                }
                rmin++;

                for (int m = rmin; m <= rmax && count < row * col; m++){
                    System.out.println(arr[m][cmax] + " ");
                    count++;
                }
                cmax--;

                for (int n = cmax; n >= cmin && count < row * col; n--){
                    System.out.println(arr[rmax][n] + " ");
                    count++;
                }
                rmax--;

                for (int m = rmax; m >= rmin && count < row * col; m--){
                    System.out.println(arr[m][cmin] + " ");
                    count++;
                }
                cmin++;
            }
        }
    }
}