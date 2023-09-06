package ru.gb.less3.hw.task2;

import java.util.ArrayList;

public class Main {
    //    Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddList.add(arr[i]);
            }
        }
        System.out.println(oddList);
    }
}
