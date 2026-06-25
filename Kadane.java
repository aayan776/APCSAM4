import java.util.Scanner;
class Kadane{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Max contiguous sum is: " + maxSubArraySum(a));
    }
    static int maxSubArraySum(int[] a){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++){
            max_ending_here += a[i];
            if (max_so_far < max_ending_here) max_so_far = max_ending_here;
            if (max_ending_here < 0) max_ending_here = 0;
        }
        return max_so_far;
    }
}