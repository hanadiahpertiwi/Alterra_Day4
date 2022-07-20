package tugas6;
import java.util.*;
class Tambah {
    public static int maxSum(int arr[], int n, int k) {
        int nilai = 0;
        
        if (n < k) {
            System.out.println("Invalid");
        }

        for (int i = 0; i < k; i++)
        {nilai += arr[i];}
        int jumlah = nilai;
        for (int i = k; i < n; i++) {
            jumlah += arr[i] - arr[i - k];
            nilai = Math.max(nilai, jumlah);
        }
        return nilai;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah data : ");
        int n = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan nilai K : ");
        int k = input2.nextInt();

        //Deklarasi array
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(input.next());
        }
        System.out.println(maxSum(arr, n, k));
    }
}
