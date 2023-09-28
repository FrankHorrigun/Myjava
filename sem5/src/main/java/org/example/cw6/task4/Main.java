package org.example.cw6.task4;

public class Main {
    //    Напишите интерфейс Converter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты.
//    У классов наследников необходимо переопределить метод интерфейса,
//    для валидного перевода величин. Метод для конвертации назовите "convertValue".
    public static void main(String[] args) {
        double temp = 100;
        System.out.println("фаренгейт: " + new FarConvert().convertValue(temp));
        System.out.println("келвин: " + new KelConvert().convertValue(temp));
        System.out.println("цельсий: " + new CelConvert().convertValue(temp));
    }
}
