package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

public class BlueJayTest {

    @Test
    public void testMove() {
        Bird blueJay = (Bird)(Object)new BlueJay();
        String expected = "fly";

        String actual = blueJay.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal blueJay = (Animal)(Object)new BlueJay();
        String expected = "Blue";

        String actual = blueJay.color();

        Assert.assertEquals(expected, actual);
    }
}
