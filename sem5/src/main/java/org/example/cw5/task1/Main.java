package org.example.cw5.task1;

import java.util.HashMap;

import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String text = "qerwqtyeuyioqytuirwupqetyuw";
        Map<Character, Integer> mapCh = getCharacterIntegerMap(text);
        for (Map.Entry<Character, Integer> item : mapCh.entrySet()) {
            System.out.println("количество вхождений элемента " + item.getKey() + " равно " + item.getValue());
        }
        System.out.println("mapCh = " + mapCh);
    }

    /**
     * @param text
     * @return
     * @apiNote Посчитать количество вхождений каждого символа в текст.
     */
    private static Map<Character, Integer> getCharacterIntegerMap(String text) {
        Map<Character, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!mapCh.containsKey(text.charAt(i))) {
                mapCh.put(text.charAt(i), 1);
            } else {
                mapCh.put(text.charAt(i), mapCh.get(text.charAt(i)) + 1);
            }
        }
        return mapCh;
    }
}