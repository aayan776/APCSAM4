import java.util.ArrayList;
import java.util.Scanner;
class RemovePrime{
    public static void solution(ArrayList<Integer> al){
        for (int i = al.size() - 1;i >= 0; i--){
            if (IsPrime(al.get(i)) == true){
                al.remove(i);
            }
        }
    }
    public static boolean IsPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int c = 2; c * c <= n; c++){
            if (n % c == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter elements of array (press 0 to break): ");
        int n = -1;
        while (n != 0){
            n = sc.nextInt();
            if (n != 0){
                al.add(n);
            }
        }
        solution(al);
        System.out.println("Modified array (without primes); " + al);
    }
}
