package org.example.hw5.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");

        for (Map.Entry<String, Integer> name : sortedNamesCount(names).entrySet()) {
            System.out.println("имя " + name.getKey() + " повторяется " + name.getValue() + " раз");
        }
    }

    /**
     * @param names заданный список имен и фамилий
     * @return отсортированная карта имен по числу повторений в увывающем порядке
     * @apiNote Пусть дан список сотрудников. Написать программу, которая найдёт и
     * выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
     */
    private static Map<String, Integer> sortedNamesCount(List<String> names) {
        Map<String, Integer> namesCountMap = new HashMap<>();
        for (String name : names) {
            String str = name.substring(0, name.indexOf(" "));
            if (!namesCountMap.containsKey(str)) {
                namesCountMap.put(str, 1);
            } else {
                namesCountMap.put(str, namesCountMap.get(str) + 1);
            }
        }
        return namesCountMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
