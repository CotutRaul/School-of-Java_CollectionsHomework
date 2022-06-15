import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("-=-=LIST=-=-");

        List <Integer> list = new ArrayList<>();

        for(int i = 1; i<=10; i++)
        {
            list.add(i);
        }
        for (int e : list) {
            if (e%2 == 0) {
                System.out.println(e);
            }
        }
        System.out.println("\n-=-=SET=-=-");
        Set <String> set = new HashSet<>();
        set.add("Cotut");
        set.add("Cotut");
        set.add("Cotut");
        for (String s : set) {
            System.out.println(s);
        }
        //Set doesn't save duplicates

        System.out.println("\n-=-=MAP=-=-");

        Map <String,Integer> map = new HashMap<>();
        map.put("Cotut",100);
        map.put("Ioan",10);
        map.put("Miha",99);
        map.put("Rafa",50);
        map.put("Iulian",5);

        for (String s : map.keySet()) {
            if (map.get(s)>10)
            {
                System.out.println(s);
            }
        }


    }


}
