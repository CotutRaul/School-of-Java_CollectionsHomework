import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 4, 0, 5, 2, 1, 2, 4, 1,0);
        System.out.println("Make a List:\n" + list);

        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("\nEliminate all duplicates and print the list.\n" + list);

        list.sort((a, b) -> b-a);
        System.out.println("\nSort the numbers from high to low in the list and print it.\n" + list);

        Set<String> set = new LinkedHashSet<>(list.stream().map(Object::toString).collect(Collectors.toList()));
        System.out.println("\nCreate a Set of Strings from the sorted list and print it.\n" + set);
        Set<String> set2 = new HashSet<>(list.stream().map(Object::toString).collect(Collectors.toList()));
        System.out.println("In caz ca nu trebuia sa fie in aceeasi oridine ca si lista:\n" + set2);



        Map <String,Integer> map = new HashMap<>();

        Iterator<Integer> iList = list.iterator();
        Iterator<String> iSet = set2.iterator();
        while (iList.hasNext() && iSet.hasNext())
        {
            map.put(iSet.next(),iList.next());
        }
        System.out.println("\nCreate a Map having the resulted set as the keySet and the list as values for each key:\n" + map);

    }
}
