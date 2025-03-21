package com.zz.student.Generics_;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class Dao <T>{
    private T t;
    private Map<String, T> map;
   public Dao() {
    }
    public Dao(T t, Map<String, T> map) {
        this.t = t;
        this.map = map;
    }


    public void save(String key, T t){
        map.put(key,t);
    }
    public T get(String key){
        return map.get(key);
    }
    public void update(String key, T t){
        map.put(key,t);
    }
    public void delete(String key){
        map.remove(key);
    }
    public void show(){
        for (Map.Entry<String, T> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public List<T> showList(){
        List<T> list = new ArrayList<>();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
