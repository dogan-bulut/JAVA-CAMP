package beykent.java.week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Istanbul");
        map.put(2, "Ankara");
        map.put(3, "Adana");
        map.put(4, "Antalya");

        System.out.println("HashMap = " + map);

        // Iterate over HashMap
        //1. use keySet()

        System.out.println(map.containsKey(3));
        System.out.println(map.size());
        System.out.println(map.containsValue("Ankara"));

        for(Integer key : map.keySet()){
            System.out.println("Key = " + key + ", and val = " + map.get(key));
        }


        map.put(4, "Trabzon");
        // 2. Iterator

        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()){
            Integer key = (Integer) itr.next();
            System.out.println("Key = " + key + ", value = " + map.get(key));
        }

        // 3. Iterator
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry m = (Map.Entry)iterator.next();
            System.out.println(m.getKey()+", " + m.getValue());
        }

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + "- " + entry.getValue());
        }

        int[] array = {1,5,5,5,5, 3, 100, 1, 1, 1, 12, 15, 6, 6, 6};
        calculateFrequency(array);

    }

    // [1,1,5,1,120,2,3,4,5,5,5,120]

    public static void calculateFrequency(int[] array){

        if(array == null)  return;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int element  = array[i];
            if(frequencyMap.containsKey(element)){
                int value = frequencyMap.get(element)+1;
                frequencyMap.put(element, value);
            }else{
                frequencyMap.put(element, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
