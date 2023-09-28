package org.example.cw6.task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "x"));
        Set<String> stringSet3 = getStrings(mas1, mas2);
        System.out.println("пересечение = " + stringSet3);
        result(mas1, mas2, stringSet3);
    }

    /**
     *
     * @param mas1
     * @param mas2
     * @return пересечение массивов
     */
    private static Set<String> getStrings(List<String> mas1, List<String> mas2) {
        Set<String> stringSet2 = new HashSet<>(mas2);
        Set<String> stringSet3 = new HashSet<>(mas1);
        stringSet3.retainAll(stringSet2);
        return stringSet3;
    }

    /**
     * @param mas1       входной массив 1
     * @param mas2       входной массив 2
     * @param stringSet3 результат
     * @apiNote Найти пересечения слов в массивах и указать их общее количество.
     */
    private static void result(List<String> mas1, List<String> mas2, Set<String> stringSet3) {
        for (String s : stringSet3) {
            int k = 0;
            for (String item : mas1) {
                if (s.equals(item)) {
                    k++;
                }
            }
            for (String item : mas2) {
                if (s.equals(item)) {
                    k++;
                }
            }
            System.out.printf("количество: %s равно %d\n", s, k);
        }
    }
}

