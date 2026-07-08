import java.util.Scanner;
class RingRotate{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num of rows:");
        int n = sc.nextInt();

        System.out.println("Num of cols:");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter ring number:");
        int sno = sc.nextInt();

        System.out.println("Enter rotation number:");
        int rno = sc.nextInt();

        ringrotate(arr, sno, rno);

        display(arr);
    }
    public static void ringrotate(int[][] arr, int sno, int rno){
        int[] la = Fill1Dfrom2D(arr, sno);

        rotate1D(la, rno);

        Fill2Dfrom1D(arr, la, sno);
    }
    public static int[] Fill1Dfrom2D(int[][] arr, int sno){
        int rmin = sno - 1;
        int cmin = sno - 1;

        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;

        int sz = 2 * (rmax - rmin + cmax - cmin);

        int[] la = new int[sz];
        int idx = 0;

        for (int rows = rmin; rows <= rmax; rows++){
            la[idx] = arr[rows][cmin];
            idx++;
        }
        cmin++;

        for (int cols = cmin; cols <= cmax; cols++){
            la[idx] = arr[rmax][cols];
            idx++;
        }
        rmax--;

        for (int rows = rmax; rows >= rmin; rows--){
            la[idx] = arr[rows][cmax];
            idx++;
        }
        cmax--;

        for (int cols = cmax; cols >= cmin; cols--){
            la[idx] = arr[rmin][cols];
            idx++;
        }
        rmin++;

        return la;
    }

    public static void rotate1D(int[] la, int rno){
        rno %= la.length;
        if (rno < 0){
            rno += la.length;
        }

        reverse(la, 0, la.length - 1);
        reverse(la, 0, rno - 1);
        reverse(la, rno, la.length - 1);
    }
    public static void reverse(int[] la, int left, int right){
        while (left < right){
            int temp = la[left];
            la[left] = la[right];
            la[right] = temp;
            left++;
            right--;
        }
    }
    public static void Fill2Dfrom1D(int[][] arr, int[] la, int sno){
        int rmin = sno - 1;
        int cmin = sno - 1;

        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;

        int idx = 0;

        for (int rows = rmin; rows <= rmax; rows++){
            arr[rows][cmin] = la[idx];
            idx++;
        }
        cmin++;

        for (int cols = cmin; cols <= cmax; cols++){
            arr[rmax][cols] = la[idx];
            idx++;
        }
        rmax--;

        for (int rows = rmax; rows >= rmin; rows--){
            arr[rows][cmax] = la[idx];
            idx++;
        }
        cmax--;

        for (int cols = cmax; cols >= cmin; cols--){
            arr[rmin][cols] = la[idx];
            idx++;
        }
        rmin++;
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println("");
        }
    }
}