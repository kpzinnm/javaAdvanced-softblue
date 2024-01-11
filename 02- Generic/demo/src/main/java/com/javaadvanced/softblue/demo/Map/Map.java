package com.javaadvanced.softblue.demo.Map;


import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {

    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    /**
     * Insert new value in Map and return True if key does not exist in Map
     **/
    public Boolean put(K key, V value){
        Boolean out = Boolean.FALSE;
        if(!(existsKeyInMap(key))){
            this.keys.add(key);
            this.values.add(value);
            out = Boolean.TRUE;
        }
        return out;
    }

    public void clear(){
        this.keys.clear();
        this.values.clear();
    }

    public V get(K key){
        V out = null;
        if(existsKeyInMap(key)){
            out = this.values.get(this.keys.indexOf(key));
        }
        return out;
    }


    private Boolean existsKeyInMap(K key){
        return this.keys.indexOf(key) >= 0;
    }

}
