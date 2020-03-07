package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getSpeed() > animal2.getSpeed()) return -1;
        if (animal1.getSpeed() < animal2.getSpeed()) return 1;
        return 0;
    }
}
