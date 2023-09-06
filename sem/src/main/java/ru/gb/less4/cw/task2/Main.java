package ru.gb.less4.cw.task2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("sum = " + getSum(integerList));

    }

    /**
     * @apiNote Note Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
     * @param integerList
     * @return сумму четных элементов списка
     */
    private static int getSum(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

}

