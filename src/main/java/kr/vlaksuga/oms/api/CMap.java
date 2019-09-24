package kr.vlaksuga.oms.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CMap implements java.util.Map<String,Object>{
    java.util.Map<String,Object> map;

    public CMap(java.util.Map<String,Object> baseMap) {
        this.map = baseMap;
    }

    public CMap(){
        this(new java.util.HashMap<String,Object>());
    }



    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    @Override
    public Object put(String key, Object value) {
        key = key.toUpperCase();
        return map.put(key,value);
    }

    @Override
    public Object remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set keySet() {
        return map.keySet();
    }

    @Override
    public Collection values() {
        return map.values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return map.entrySet();
    }

    public String getS(String key){
        return this.map.getOrDefault(key,"null").toString();
    }

    public int getI(String key){
        return Integer.parseInt(this.getS(key),10);
    }

    public long getL(String key){
        return Long.parseLong(this.getS(key),10);
    }
}
