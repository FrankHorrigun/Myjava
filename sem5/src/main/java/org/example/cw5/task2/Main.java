package org.example.cw5.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
//                В противном случае (false).
        int[] arr = {1, 2, 3, 4, 2, 4, 4, 5};
        Map<Integer, Integer> integerMap = getIntegerIntegerMap(arr);
        System.out.println("integerMap = " + integerMap);
        checkIfExists(integerMap);
    }

    private static void checkIfExists(Map<Integer, Integer> integerMap) {
        for (Map.Entry<Integer, Integer> item : integerMap.entrySet()) {
            if (item.getValue() > 1) {
                System.out.println("элемент " + item.getKey() + " повторяется " + item.getValue() + " раза");
                return;
            } else {
                System.out.println("false");
            }
        }
    }

    private static Map<Integer, Integer> getIntegerIntegerMap(int[] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!integerMap.containsKey(arr[i])) {
                integerMap.put(arr[i], 1);
            } else {
                integerMap.put(arr[i], integerMap.get(arr[i]) + 1);
            }
        }
        return integerMap;
    }
}
