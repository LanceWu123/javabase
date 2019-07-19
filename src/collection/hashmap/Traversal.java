package collection.hashmap;

/**
 * ClassName: Traversal
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/7/18 12:07
 * Description:
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 遍历HashMap的几种方法
 * 有如下几种方法：
 *
 * 1. 通过keyset
 *
 * 2. 通过 Map.entrySet().iterator()
 *
 * 3. 通过foreach ---- Map.entryset, 当hashmap很大时，推荐使用这种方式。
 *
 * 4. 通过Valueset
 */
public class Traversal {

    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"gogo");
        hashmap.put(2,"wade");
        hashmap.put(3,"james");
        hashmap.put(4,"curry");
        // 1. 通过Map.keySet遍历key和value：
        for (int key : hashmap.keySet()){
            System.out.println("key: "+ key + "; value: " + hashmap.get(key));
        }

        //2. 通过Map.entrySet使用iterator遍历key和value：
        Iterator<Map.Entry<Integer, String>> it = hashmap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key: "+ entry.getKey() + "; value: " + entry.getValue());
        }

        //3. 通过Map.entrySet遍历key和value
        for(Map.Entry<Integer, String> entry : hashmap.entrySet()){
            System.out.println("key: "+ entry.getKey() + "; value: " + entry.getValue());
        }

        //4. 通过Map.values()遍历所有的value，但不能遍历key
        for (String value : hashmap.values()) {
            System.out.println("value: "+value);
        }
    }
}
