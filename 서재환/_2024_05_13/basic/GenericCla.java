package homework._2024_05_13.basic;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class GenericCla <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> String add(T t1,T t2){
        return String.valueOf(t1) + String.valueOf(t2);
    }
    public static Integer sum(List<?> list){
        if(list.isEmpty()){
            return 0;
        }
        if(list.get(0) instanceof Integer || list.get(0) instanceof Double || list.get(0) instanceof Float || list.get(0) instanceof Long || list.get(0) instanceof Short){
            Float sum = 0.0F;
            for(Object o : list){
                sum += (Float)o;
            }
            return Math.round(sum);
        }
        return null;
    }
    public static void printArr(List<?> arr){
        for(int i = 0;i<arr.size();i++){
            if(i%3==0){
                System.out.println(arr.get(i));
            }
        }
    }
    public static <T extends Number> T getMin(List<T> list){
        if(list.isEmpty()){
            return null;
        }
        Number min = list.get(0);
        if(min instanceof Integer || min instanceof Long){
            for(int i = 1;i<list.size();i++){
                if((Long) min>(Long)list.get(i)){
                    min = list.get(i);
                }
            }
        }
        else if(min instanceof Double || min instanceof Float){
            for(int i = 1;i<list.size();i++){
                if((Double) min>(Double) list.get(i)){
                    min = list.get(i);
                }
            }
        }
        return (T)min;
    }
    public static <K,V> void printOverTen(Map<K,V> map){
        for(Map.Entry<K,V> entry : map.entrySet()){
            if(String.valueOf(entry.getValue()).length() >= 10){
                System.out.println(entry.getKey());
            }
        }
    }
}
