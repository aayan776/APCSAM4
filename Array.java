import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--){
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < n; i++){
            System.out.println("Reverse array: ");
            System.out.println(arr2[i]);
        }
    }
}