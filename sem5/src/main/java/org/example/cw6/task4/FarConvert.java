package org.example.cw6.task4;

public class FarConvert implements Converter {
    @Override
    public double convertValue(double baseTemp) {
        return 1.8 * baseTemp + 32;
    }
}
