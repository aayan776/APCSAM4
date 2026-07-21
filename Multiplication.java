import java.util.*;
class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimension of array: ");
        int dimension = sc.nextInt();

        int[][] arr1 = new int[dimension][dimension];
        int[][] arr2 = new int[dimension][dimension];

        System.out.println("Enter elements of first array: ");
        for (int i = 0; i < dimension; i++){
            System.out.println("Enter elements of row " + (i + 1) + ": ");
            for (int j = 0; j < dimension; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second array: ");
        for (int i = 0; i < dimension; i++){
            System.out.println("Enter elements of row " + (i + 1) + ": ");
            for (int j = 0; j < dimension; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Array 1:");
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Array 2:");
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Multiplied matrix: ");

        int[][] multiplied = multiply(dimension, arr1, arr2);

        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                System.out.print(multiplied[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public static int[][] multiply(int dimension, int[][] arr1, int[][] arr2){
        int[][] multiplied = new int[dimension][dimension];

        for(int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                int l = 0;
                multiplied[i][j] = arr1[i][l] * arr2[l][j];
                while (l < dimension){
                    l++;
                    if (l == dimension){
                        break;
                    }
                    multiplied[i][j] += arr1[i][l] * arr2[l][j];
                }
            }
        }
        return multiplied;
    }
}