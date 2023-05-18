package day43_map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // order no guaranteed | null as key is ok
        map.put("Java", "James");
        map.put("Tom", "Cartoon");
        map.put("Bon", "Movie");
        map.put("Nadir", "Automation");
        map.put("null", "test");
        System.out.println(map);

        System.out.println("===================================");
        Map<String, String> linked = new LinkedHashMap<>(); // Maintains the Insertion order | accepts null
        linked.put("Java", "James");
        linked.put("Tom", "Cartoon");
        linked.put("Bon", "Movie");
        linked.put("Nadir", "Automation");
        linked.put("null", "test");
        System.out.println(linked);

        System.out.println("=====================================");
        // Maintains the sorter (Ascending) order
        Map<String, String> treemap = new TreeMap<>();
        treemap.put("Java", "James");
        treemap.put("Tom", "Cartoon");
        treemap.put("Bon", "Movie");
        treemap.put("Nadir", "Automation");
        //treemap.put("null", "test");  // does not accept null as a key,
        treemap.put("check", null);  //it accepts as value
        System.out.println(treemap);

        System.out.println("======================================");
        Map<String, String> tableMap = new Hashtable<>(); // Order is NOT guaranteed | null as key or as value is NOT OK
        tableMap.put("James", "Java");
        tableMap.put("Tom", "Cartoon");
        tableMap.put("Bond", "Movie");
        tableMap.put("Nadir", "Automation");
        // treeMap.put(null, "test");
        // tableMap.put("check", null);
        System.out.println(tableMap);


        System.out.println("****METHODS******");
        System.out.println(map.get("James"));
        System.out.println(map.get("TEST"));


        System.out.println(map.containsKey("James"));
        System.out.println(map.containsKey("TEST"));


        System.out.println(map.containsValue("Java"));
        System.out.println(map.containsValue("TEST"));

        System.out.println();
        System.out.println(map);
        map.remove("James");
        System.out.println(map);


        System.out.println();
        System.out.println(map);
        map.remove("TTTTT");
        System.out.println(map);


    }
}
/*
    .put(key, value);  ---- > this method will add a key and value if the key does not exist in the map. If the key is already in the map, it will just update the value.
    .get(key);          --- > this method will return the value of the matching key, if there is no matching, it will return null
    .containsKey(key);  --- > this method will return boolean if the given key exist among the keys in the map
    .containsValue(value); - > this method will return boolean if the given value exist among the values in the map
    .remove(key);       --- > this method will remove the data (key & value), if the given key is among the keys in the map
 */


