package cn.lichao.util.collection;

import java.util.Map;
import java.util.function.Supplier;

public class MapUtils {

    /**
     * get value from map. if absent return value created by supplier
     * @param key
     * @param map
     * @param supplier create value
     * @param <K> key type
     * @param <V> value type
     * @return
     */
    public static <K, V> V getOrCreateValue(K key, Map<K, V> map, Supplier<V> supplier) {
        return map.computeIfAbsent(key, k -> supplier.get());
    }


}
