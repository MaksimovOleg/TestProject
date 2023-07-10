package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqElement {
    public static void main(String[] args) {
//Найти первый не повторяющийся элемент в массиве целых чисел
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (resultMap.containsKey(arr[i])) {
                Integer val = resultMap.get(arr[i]);
                resultMap.put(arr[i], val+1);
            } else {
                resultMap.put(arr[i], 0);
            }
        }
        Integer result = 0;
        for (Map.Entry<Integer, Integer> e:resultMap.entrySet()) {
            if (e.getValue() == 0) {
                result = e.getKey();
                break;
            }
        }
        System.out.println(result);
    }
}


