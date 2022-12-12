package SetStudy.HashMapExample;

import java.util.*;

public class HashMapCountingExample {
    public static void main(String[] args) {
        String[] data = {"A", "K","A","K", "D","K","A","K","D","A","K"};
        Map<String, Integer> hashMap = new HashMap();

        for (String str : data) {
            if (hashMap.containsKey(str)) {
                int count = hashMap.get(str);
                hashMap.replace(str, count + 1);
            }
            else{
                hashMap.put(str, 1);
            }
        }

        Set entrySet = hashMap.entrySet();
        Iterator it = entrySet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
