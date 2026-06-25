import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Enter number: ");
            int input = sc.nextInt();
            nums[i] = input;
        }
    }
}