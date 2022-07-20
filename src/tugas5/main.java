package tugas5;

import java.util.Scanner;

public class main {
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah data : ");
        int n = input.nextInt();

        //Deklarasi array
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            a[i] = Integer.parseInt(input.next());
        }

        n = removeduplicates(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
