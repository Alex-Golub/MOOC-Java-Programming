
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jul 3, 2020 3:07:03 PM
 */
public class MyHashMap<K, V> {

  private List<List<Pair<K, V>>> entries;

  public MyHashMap() {
    this.entries = new ArrayList<>();
  }

  /**
   * search based on key demands only going through a small number of key-value
   * pairs — assuming that the key object hash values are calculated otherwise
   * we lose constant time search and get linear-search
   */
  public V get(K key) {
    if (this.entries.isEmpty()) {
      return null;
    }

    int bucket = Math.abs(key.hashCode() % this.entries.size());

    final List<Pair<K, V>> list = this.entries.get(bucket);

    for (int i = 0, size = list.size(); i < size; i++) {
      final Pair<K, V> pair = list.get(i);
      if (pair.getKey().equals(key)) {
        return pair.getValue();
      }
    }

    return null;
  }

  public void add(K key, V value) {
    // if map is empty create new entry otherwise 
    // calculation of bucketNo will fail with / by zero
    if (this.entries.isEmpty()) {
      this.entries.add(new ArrayList<>());
    }

    // calculate hash value for key to determine
    // in which bucket to be placed
    int bucketNo = Math.abs(key.hashCode() % this.entries.size());

    // Retrive list of key-value pairs from this bucketNo
    List<Pair<K, V>> valuesInBucket = this.entries.get(bucketNo);

    int index = getIndexOfKey(valuesInBucket, key);

    if (index < 0) { // insert new key -> value pair
      valuesInBucket.add(new Pair(key, value));
    } else { // update key at index with the new value
      valuesInBucket.get(index).setValue(value);
    }
  }

  private int getIndexOfKey(List<Pair<K, V>> list, K key) {
    for (int i = 0, size = list.size(); i < size; i++) {
      if (list.get(i).getKey().equals(key)) {
        return i;
      }
    }
    return -1;
  }
  
  public V remove(K key) {
    int bucketNo = Math.abs(key.hashCode() % this.entries.size());
    final List<Pair<K, V>> list = this.entries.get(bucketNo);
    int index = getIndexOfKey(list, key);
    
    return index < 0 ? null : list.remove(index).getValue();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (List<Pair<K, V>> entry : this.entries) {
      for (Pair<K, V> pair : entry) {
        sb.append(pair.getKey() + " -> " + pair.getValue() + "\n");
      }
    }
    
    return sb.toString();
  }
}
