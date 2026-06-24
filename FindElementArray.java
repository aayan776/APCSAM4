import java.util.Scanner;

class FindElementArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to search for: ");
        int d = sc.nextInt();

        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, d);
        System.out.println(ans);

    }
    public static int find(int[] arr, int d){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == d){
                return i;
            }
        }
        return -1;
    }
}