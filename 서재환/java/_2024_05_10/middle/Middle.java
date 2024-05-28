package homework._2024_05_10.middle;

import java.util.*;

public class Middle {
    public static void main(String[] args) {
        Map<Integer,Integer> input=new HashMap<>();
        input.put(1,2);
        input.put(2,3);
        input.put(3,4);
        input.put(4,5);
        System.out.println(middle2(input));
        middle3(input);
    }

    public static void middle1(Scanner sc) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        Optional<Map.Entry<String, Integer>> maxValue=map.entrySet().stream().max(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()){
                    return 1;
                }
                else if(o1.getValue() < o2.getValue()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        if(maxValue.isPresent()){
            System.out.println(maxValue.get().getKey());
            System.out.println(maxValue.get().getValue());
        }

    }

    public static Map.Entry<Integer,Integer> middle2(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
        int max = Integer.MIN_VALUE;
        Integer key = 0;
        Integer value = 0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            if(max<next.getKey()*next.getValue()) {
                max = next.getKey()*next.getValue();
                key = next.getKey();
                value = next.getValue();
            }
        }
        return Map.entry(key,value);
    }

    public static void middle3(Map<Integer, Integer> map) {
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        for (int i=0;i<map.size();i++){
            System.out.println("key"+list.get(i).getKey()+" value"+list.get(map.size()-i-1).getValue());
            System.out.println();
        }

    }
}
