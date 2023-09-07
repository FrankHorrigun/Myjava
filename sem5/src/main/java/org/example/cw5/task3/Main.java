package org.example.cw5.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Написать перевод из Римских цифр в арабские:
//        1) ввод: s = "LVIII"
////        вывод: 58
////        разбор: L = 50, V= 5, III = 3.
////        2) ввод: s = "MCMXCIV"
////        вывод: 1994
////        разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
//           I 1
////        V 5
////        X 10
////        L 50
////        C 100
////        D 500
////        M 1000
        Map<Character, Integer> mapNumbers = new HashMap<>();
        mapNumbers.put('I', 1);
        mapNumbers.put('V', 5);
        mapNumbers.put('X', 10);
        mapNumbers.put('L', 50);
        mapNumbers.put('C', 100);
        mapNumbers.put('D', 500);
        mapNumbers.put('M', 1000);
        System.out.println("mapNumbers = " + mapNumbers);
        String str = "LVIII";
        String str1 = "MCMXCIV";
        int res = numberFromRome(mapNumbers, str1);
        System.out.println(str1 + " = " + res);
    }

    private static int numberFromRome(Map<Character, Integer> mapNumbers, String str1) {
        int res = mapNumbers.get(str1.charAt(str1.length() - 1));
        for (int i = 0; i < str1.length() - 1; i++) {
            if (mapNumbers.get(str1.charAt(i)) >= mapNumbers.get(str1.charAt(i + 1))) {
                res += mapNumbers.get(str1.charAt(i));
            } else {
                res -= mapNumbers.get(str1.charAt(i));
            }
        }
        return res;
    }

}
