package tugas4;

import java.util.Scanner;

class unik {
    static void printDistinct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah data : ");
        int n = input.nextInt();

        //Deklarasi array
        int [] arr = new int[n];

        //Input data ke array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(input.next());
        }
        printDistinct(arr, n);

    }
}