package de.Paul.api.utils;

import java.util.HashMap;
import java.util.Map;

public class TripleKeyMap<A, B, C, V> {
    private Map<TripleKey<A, B, C>, V> map = new HashMap<>();

    public V put(A key1, B key2, C key3, V value) {
        return map.put(new TripleKey<>(key1, key2, key3), value);
    }

    public V get(A key1, B key2, C key3) {
        return map.get(new TripleKey<>(key1, key2, key3));
    }

    public boolean containsKeys(A key1, B key2, C key3) {
        return map.containsKey(new TripleKey<>(key1, key2, key3));
    }

    public V remove(A key1, B key2, C key3) {
        return map.remove(new TripleKey<>(key1, key2, key3));
    }

    public Map<TripleKey<A, B, C>, V> entrySet() {
        return map;
    }
}
