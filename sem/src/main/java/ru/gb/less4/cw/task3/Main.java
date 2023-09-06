package ru.gb.less4.cw.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Заменить некратные 3 элементы списка, суммой нечетных элементов.
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = getSum(integerList);
        replace(integerList, sum);
        System.out.println("integerList = " + integerList);
    }

    private static void replace(List<Integer> integerList, int sum) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sum);
            }
        }
    }

    private static int getSum(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 != 0) {
                sum += integerList.get(i);
            }
        }
        return sum;
    }
}
