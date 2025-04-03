package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    private MyHashMap map;

    @BeforeEach
    void setUp() {
        map = new MyHashMap();
    }

    @Test
    public void testPutAndGet() {
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        assertEquals(10, map.get(1));
        assertEquals(20, map.get(2));
        assertEquals(30, map.get(3));
        assertEquals(-1, map.get(4));  // key 4 doesn't exist
    }

    @Test
    public void testUpdateValue() {
        map.put(1, 10);
        map.put(1, 15);  // update the value for key 1

        assertEquals(15, map.get(1));
    }

    @Test
    public void testRemove() {
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        map.remove(2);
        assertEquals(-1, map.get(2));  // key 2 should be removed
        assertEquals(10, map.get(1));
        assertEquals(30, map.get(3));

        map.remove(1);
        assertEquals(-1, map.get(1));  // key 1 should be removed

        map.remove(3);
        assertEquals(-1, map.get(3));  // key 3 should be removed
    }

    @Test
    public void testRemoveNonExistingKey() {
        map.put(1, 10);
        map.put(2, 20);

        map.remove(3);  // key 3 doesn't exist, should not affect existing keys
        assertEquals(10, map.get(1));
        assertEquals(20, map.get(2));
    }

    @Test
    public void testCollisionHandling() {
        int hashTableSize = 1000000;

        // These keys will collide if the hash table size is 1000000
        map.put(1, 10);
        map.put(1 + hashTableSize, 20);
        map.put(1 + 2 * hashTableSize, 30);

        assertEquals(10, map.get(1));
        assertEquals(20, map.get(1 + hashTableSize));
        assertEquals(30, map.get(1 + 2 * hashTableSize));
    }
}