package org.example.cw6.task4;

public class KelConvert implements Converter {
    @Override
    public double convertValue(double baseTemp) {
        return baseTemp + 273.1;
    }
}
