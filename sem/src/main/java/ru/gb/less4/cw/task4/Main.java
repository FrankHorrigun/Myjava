package ru.gb.less4.cw.task4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        List<Integer> integerList = new LinkedList<>(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9));
        delElements(integerList);
        System.out.println("integerList = " + integerList);
    }

    private static void delElements(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
                i--;//сбрасываем счетник ибо перескакивает, если отрицательные идут по порядку. Либо справа налево пробежать
            }
        }
    }
}
