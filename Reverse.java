import java.util.*;

class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Original Array: " + list);
        System.out.println("Reversed Array: " + reverse(list));
    }
    static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--){
            ans.add(list.get(i));
        }
        return ans;
    }
}