package collection.map.basic;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tom on 2018/9/23.
 */
public class Comparision {
    private static Hashtable hashtable = new Hashtable();
    private static HashMap hashMap = new HashMap();
    private static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    public static void main(String[] args) {
        //hashtable can not be put null as key value
        //hashtable.put(null,"");
        hashMap.put(null,"");
    }
}
