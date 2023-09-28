package org.example.cw6.task1;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 4, 5, 6, 1, 3, 4));
        int res = getRes(arr);
        System.out.println("res = " + res);
    }

    /**
     * @param arr массив
     * @return процет уникальных чисел по формуле
     * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
     */
    private static int getRes(List<Integer> arr) {
        Set<Integer> integerSet = new HashSet<>(arr);
        int res = integerSet.size() * 100 / arr.size();
        return res;
    }
}
