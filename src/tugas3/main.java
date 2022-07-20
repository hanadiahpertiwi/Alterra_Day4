package tugas3;
import java.util.*;

public class main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah data : ");
        int n = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan nilai target : ");
        int sum = input2.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(input.next());
        }
        getPairsCount(arr, sum);
    }
    public static void getPairsCount(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                {
                    System.out.print(i+",");
                    System.out.print(j);
                }
    }

}
