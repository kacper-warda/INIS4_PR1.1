package com.company.devices;

import java.util.Comparator;

public class YearOfProductionComparator implements Comparator<Device> {
    @Override
    public int compare(Device o1, Device o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return o1.yearOfProduction - o2.yearOfProduction;
    }
}
