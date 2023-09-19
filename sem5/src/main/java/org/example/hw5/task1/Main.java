package org.example.hw5.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Map<String, Integer> stringIntegerMap = getStringIntegerMap(str);
        for (Map.Entry<String, Integer> word : stringIntegerMap.entrySet()) {
            System.out.println("в тексте слово " + '"' + word.getKey() + '"' + " содержится " + word.getValue() + " раз");
        }
    }

    /**
     * +
     *
     * @param str заданный текс
     * @return map где ключ - слово, значение - количество повторений слова в тексте
     * @apiNote Подсчитать количество вхождения каждого слова
     */
    private static Map<String, Integer> getStringIntegerMap(String str) {
        str = str.toLowerCase()
                .replace(".", "")
                .replace(":", "")
                .replace(";", "")
                .replace(",", "")
                .replace("— ", "")
                .replace("!", "")
                .replace("?", "");
        String[] strArray = str.split(" ");


        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : strArray) {
            if (!stringIntegerMap.containsKey(s)) {
                stringIntegerMap.put(s, 1);
            } else {
                stringIntegerMap.put(s, stringIntegerMap.get(s) + 1);
            }
        }
        return stringIntegerMap;
    }
}
