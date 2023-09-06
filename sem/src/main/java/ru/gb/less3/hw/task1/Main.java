package ru.gb.less3.hw.task1;

import java.util.Arrays;

public class Main {
    //    Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и реализует алгоритм сортировки слиянием.
//    Метод должен возвращать отсортированный массив.
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 3, 1, 4, 6, 8, -5, 0, 12, 55, -55, 0, 3};
        System.out.println("arr = " + Arrays.toString(arr));
        int[] a = mergeSort(arr);
        System.out.println("a = " + Arrays.toString(a));
    }

    private static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n == 1) return a;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(a, l, r);
        return a;
    }

    private static void merge(int[] a, int[] l, int[] r) {
        int right = r.length;
        int left = l.length;
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[idx] = l[i];
                i++;
            } else {
                a[idx] = r[j];
                j++;
            }
            idx++;
        }
        for (int ll = i; ll < left; ll++) {
            a[idx++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            a[idx++] = r[rr];
        }
    }
}
