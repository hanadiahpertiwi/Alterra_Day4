package tugas2;
import java.util.*;

public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kata : ");
        int n = input.nextInt();

        //Deklarasi array
        String[] kata = new String[n];

        //Input data ke array
        for (int i = 0; i < kata.length; i++) {
            System.out.print("Kata ke " + (i + 1) + " : ");
            kata[i] = input.next();
        }
        List li5 = new ArrayList(List.of(kata));
        List li4 = new ArrayList(new HashSet(li5));
        Iterator it = li4.iterator();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (kata[i].equals(kata[j])) {
                    while (it.hasNext()) {
                        if (kata[i].equals(kata[j])) {
                            System.out.print(" " + it.next());
                        }
                    }
                }
            }
        }
    }

}


