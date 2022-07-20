package tugas1a;
import java.util.Iterator;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] li1 = {"one", "one", "two"};
        String[] li2 = {"five", "four",};

        String[] li3 = Stream.concat(
                Arrays.stream(li1),
                Arrays.stream(li2)
        ).toArray(String[]::new);

        System.out.println(Arrays.toString(li3));
        List li5 = new ArrayList(List.of(li3));

        List li4 = new ArrayList(new HashSet(li5));
        Iterator it = li4.iterator();
        while (it.hasNext()) {
            System.out.print(" " + it.next());
        }
    }
}

