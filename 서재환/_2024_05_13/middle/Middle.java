package homework._2024_05_13.middle;

import lombok.Setter;

import java.util.*;

public class Middle {
    public static void main(String[] args) {

    }
    public static <K extends Number,V extends Number> Map.Entry<K,V> getMaxMul(Map<K,V> map) {
        Number max=null;
        Number key = null;
        Number value = null;
        Set<Map.Entry<K,V>> entries = map.entrySet();
        Iterator<Map.Entry<K,V>> iterator = entries.iterator();
        if(map.size() != 0) {
            Map.Entry<K,V> entry = iterator.next();
            max=entry.getKey().floatValue()*entry.getValue().floatValue();
            key=entry.getKey();
            value=entry.getValue();
        }
        while(iterator.hasNext()) {
            Map.Entry<K,V> entry = iterator.next();
            if((float)max < entry.getKey().floatValue() * entry.getValue().floatValue() ){
                max=entry.getKey().floatValue()*entry.getValue().floatValue();
                key=entry.getKey();
                value=entry.getValue();
            }
        }
        return (Map.Entry<K, V>) Map.entry(key,value);
    }


    public static <K,V> List<Map.Entry<K,V>> getOverHundr(Map<Integer,Integer> map){
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Integer>> iterator = set.iterator();
        List<Map.Entry<K,V>> list = new ArrayList<>();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue()*entry.getKey()>1000){
                list.add((Map.Entry<K, V>) Map.entry(entry.getKey(),entry.getValue()));
            }
        }
        return list;
    }
    public static Map<Integer,Integer> getOverHundr(){
        int key=50;
        int value=15;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<11;i++){
            map.put(key+i,value+i);
        }
        return  map;
    }
}

class cacul<T extends  Number>{
    public double add(T[] arr){
        if(arr.length==0) return 0;
        if(arr[0] instanceof Float || arr[0] instanceof Double){
            float sum=0;
            for(Number number:arr){
                sum+=number.floatValue();
            }
            return Math.round(sum*100)/100.0;
        }
        else{
            Long sum= 0L;
            for(Number number:arr){
                sum+=number.longValue();
            }
            return Math.round(sum*100)/100.0;
        }
    }
    public double sub(T[] arr){
        if(arr.length==0) return 0;
        if(arr[0] instanceof Float || arr[0] instanceof Double){
            float sum=0;
            for(Number number:arr){
                sum-=number.floatValue();
            }
            return Math.round(sum*100)/100.0;
        }
        else{
            Long sum= 0L;
            for(Number number:arr){
                sum-=number.longValue();
            }
            return Math.round(sum*100)/100.0;
        }
    }
    public double mul(T[] arr){
        if(arr.length==0) return 0;
        if(arr[0] instanceof Float || arr[0] instanceof Double){
            float sum=0;
            for(Number number:arr){
                sum*=number.floatValue();
            }
            return Math.round(sum*100)/100.0;
        }
        else{
            Long sum= 0L;
            for(Number number:arr){
                sum*=number.longValue();
            }
            return Math.round(sum*100)/100.0;
        }
    }
    public double div(T[] arr){
        if(arr.length==0) return 0;
        if(arr[0] instanceof Float || arr[0] instanceof Double){
            float sum=0;
            for(Number number:arr){
                sum/=number.floatValue();
            }
            return Math.round(sum*100)/100.0;
        }
        else{
            Long sum= 0L;
            for(Number number:arr){
                sum/=number.longValue();
            }
            return Math.round(sum*100)/100.0;
        }
    }
}

@Setter
class TList<T> {
    List<T> list;
    public void splitList(){
        System.out.println(list.subList(0, (list.size()+1)/2));
        System.out.println(list.subList((list.size()+1)/2,list.size()));
    }
}