package SetStudy.HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, "abc");
        hashMap.put(2, "def");
        hashMap.put(3, "ghi");
        hashMap.put(4, "jjjj");
        hashMap.put(5, "ssss");

        // Map entry(key, value) 값들 읽기
        Set entrySet = hashMap.entrySet();
        Iterator it = entrySet.iterator();

        String tmp = "";
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + "" + e.getValue());
            tmp = tmp.concat((String) e.getValue());
        }
        System.out.println("tmp = " + tmp);

        if (hashMap.containsKey(1)) {
            System.out.println(hashMap.get(1));
        }

        if (hashMap.get(4) == "jjjj") {
            System.out.println("key 4 is jjjj");
        }
    }
}
