package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String c, int n, boolean h) {
        color = c;
        numberOfPaws = n;
        hasFur = h;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %d %s and "
                + "%s fur.", color, numberOfPaws, (numberOfPaws == 1 ? "paw" : "paws")
                , (hasFur? "a" : "no"));
    }
}
