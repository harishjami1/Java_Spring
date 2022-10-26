package HashMap;
class Entry<K,V>{
    final K key;
    V value;
    Entry<K,V> next;
    Entry(K key,V value,Entry<K,V> next){
        this.key=key;
        this.value=value;
        this.next=next;
    }
}

 class MyMap<K,V>{
    private static final int INITIAL_CAPACITY =16;
    private int size = 0;
    private Entry<K,V>[] buckets = new Entry[INITIAL_CAPACITY];
    public void put(K key,V value) {
        Entry<K, V> newEntry = new Entry(key, value, null);
        int hashIndex = Math.abs(key.hashCode()) % INITIAL_CAPACITY;
        Entry<K, V> bucket = buckets[hashIndex];
        if (bucket == null) {
            buckets[hashIndex] = newEntry;
            size++;

        } else {
        	System.out.println("Entered");
            while (bucket.next!= null) {
                if (bucket.key.equals(key)) {
                    bucket.value = value;
                    return;
                }
                bucket = bucket.next;
            }
            if (bucket.key.equals(key)) {
                bucket.value = value;
            }
            else{
                bucket.next=newEntry;
                size++;
            }
        }
    }
    public V get(K key){
        int hashIndex = Math.abs(key.hashCode())%INITIAL_CAPACITY;
        Entry<K,V> bucket = buckets[hashIndex];
        while(bucket!=null){
            if(bucket.key.equals(key)){
                return bucket.value;
            }bucket=bucket.next;
        }return null;
    }}
public class HashMap{
    public static void main(String[] args) {
        MyMap<String,String> map = new MyMap<String, String>();;
        map.put("Hi","Hello");
        map.put("Hey","WhatUp");
        map.put("Hii", "Hi Again");
        map.put("Hi","Hey");
        System.out.println(map.get("Hi"));
    }
}


