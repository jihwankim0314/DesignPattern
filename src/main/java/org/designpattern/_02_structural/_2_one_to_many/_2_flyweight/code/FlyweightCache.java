package org.designpattern._02_structural._2_one_to_many._2_flyweight.code;

import java.util.HashMap;
import java.util.Map;

public class FlyweightCache {
    public Map<String, Flyweight> cache = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!cache.containsKey(key)) {
            cache.put(key, new ConcreteFlyweight(key));
        }

        return cache.get(key);
    }
}
