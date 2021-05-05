package beykent.java.week10;


public class MapRecord<K, V> implements Pair {

    private  K key;
    private  V value;

    public MapRecord(K key, V value){
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }
}
