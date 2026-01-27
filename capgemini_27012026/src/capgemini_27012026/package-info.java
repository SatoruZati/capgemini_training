package capgemini_27012026;

// maps in java

// maps are also known as dictionary in Python 

// maps store data in key value pair 
// key is unique: no duplicate keys allowed
// value can be duplicate: duplicate values allowed

// map is present in java.util package

// for example: HashMap, TreeMap, LinkedHashMap
// HashMap: stores data in key value pair, no order
// TreeMap: stores data in key value pair, sorted order			
// LinkedHashMap: stores data in key value pair, insertion order

// import java.util.HashMap; example statement to import HashMap class

// key works like index in array or list, 
// key can be of any data type: int, String, float, char, etc
// value can be of any data type: int, String, float, char, etc
// key and value can be of different data types

// the key value pair is also known as entry set, 
// each entry set is represented by Map.Entry<K,V> interface
// K is key data type, V is value data type
// Map.Entry<K,V> interface is a child interface of Map<K,V> interface

// dummy object is created to store key value pair,
// Map.Entry<K,V> entry = new AbstractMap.SimpleEntry<>(key, value);

// 16 buckets are created by default in HashMap, i.e., initial capacity is 16 
// load factor is 0.75 by default in HashMap
// when load factor exceeds 0.75, rehashing is done, i.e., capacity is doubled

// rehashing is the process of transferring all entries from old bucket to new bucket
// rehashing is an expensive operation, so it is better to set initial capacity and load factor according to requirement

// initial capacity is the number of buckets created at the time of HashMap creation
// load factor is the threshold value at which rehashing is triggered

// HashMap is not synchronized, i.e., not thread safe
// if multiple threads access HashMap concurrently, it may lead to data inconsistency
// to make HashMap synchronized, use Collections.synchronizedMap() method

// Hashtable is synchronized, i.e., thread safe
// but Hashtable is slower than HashMap due to synchronization overhead

// Hashtable does not allow null key and null value
// HashMap allows one null key and multiple null values

// LinkedHashMap maintains insertion order
// TreeMap maintains sorted order of keys

// Hashtable is a legacy class, it is recommended to use HashMap instead of Hashtable
// ConcurrentHashMap is a better alternative to Hashtable for thread safety

// ConcurrentHashMap allows concurrent access to multiple threads without locking the entire map

// Hashtable only allows homogeneous data types for keys and values, i.e., all keys must be of same data type and all values must be of same data type
// HashMap allows heterogeneous data types for keys and values, i.e., keys and values can be of different data types

// 
// methods in hashmap:
// put(K key, V value): to add key value pair to map
// putAll(Map<? extends K,? extends V> m): to add all key value pairs from another map	
// get(K key): to get value for a given key
// remove(K key): to remove key value pair for a given key
// containsKey(K key): to check if a key is present in map
// containsValue(V value): to check if a value is present in map
// size(): to get number of key value pairs in map
// isEmpty(): to check if map is empty
// clear(): to remove all key value pairs from map
// keySet(): to get all keys in map
// values(): to get all values in map
// entrySet(): to get all key value pairs in map
// replace(K key, V value): to replace value for a given key
// replace(K key, V oldValue, V newValue): to replace old value with new value for a given key

// iterator to iterate through map
// for(Map.Entry<K,V> entry : map.entrySet()) {
//     K key = entry.getKey();
//     V value = entry.getValue();
//     // do something with key and value
// }
// for each loop to iterate through map
// map.forEach((key, value) -> {
//     // do something with key and value
// });

// 

