package cn.lichao.util.collection;

import org.junit.Test;

import java.util.*;

public class MapUtilsTest {

    @Test
    public void testGetOrCreateValue() {
        Map<String, Set<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        map.put("a", set);

        Set<String> newSet = MapUtils.getOrCreateValue("a", map, HashSet::new);

        assert set==newSet;

        Set<String> emptySet = MapUtils.getOrCreateValue("b", map, HashSet::new);
        assert emptySet.isEmpty();
    }
}
