import java.util.Scanner;
class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num of rows:");
        int rows = sc.nextInt();

        System.out.println("Num of cols:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}