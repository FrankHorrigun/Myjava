package ru.gb.less3.cw.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("qwe", "asd1", 3);
        Item item2 = new Item("qwe1", "asd2", 3);
        Item item3 = new Item("qwe1", "asd3", 5);
        Item item4 = new Item("qwe3", "asd4", 3);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        System.out.println("itemList = " + itemList);

        Scanner scanner = new Scanner(System.in);
        String searchItem = scanner.nextLine();
        List<String> countries = getCountries(itemList, searchItem);
        int someVolume = someVolume(itemList, searchItem);
        System.out.println("someVolume = " + someVolume);
        System.out.println("countries = " + countries);

    }

    /**
     * @param itemList   общий список
     * @param searchItem запрашиваемый товар
     * @return поллучение списка стран, экспорьтрующих товар
     * @apiNote //Даны сведения об экспортируемых товарах: указывается наименование товара,
     * // страна, экспортирующая товар, и объем поставляемой партии в штуках.
     * // Найти страны, ко торые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
     */
    private static ArrayList<String> getCountries(List<Item> itemList, String searchItem) {
        ArrayList<String> countries = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getName().equals(searchItem)) {
                countries.add(item.getCountry());
            }
        }
        return countries;
    }

    /**
     * @param itemList
     * @param searchItem
     * @return получение количества эксопртируемого товара
     */
    private static int someVolume(List<Item> itemList, String searchItem) {
        int someVolume = 0;
        for (Item item : itemList) {
            if (item.getName().equals(searchItem)) {
                someVolume += item.getVolume();
            }
        }
        return someVolume;
    }

}
