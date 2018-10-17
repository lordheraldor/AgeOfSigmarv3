package com.heraldorapps.AgeOfSigmarVersion3.Die;

public class Die {
    private int faceUp;

    public Die() {
        roll();
    }

    public void roll() {
        faceUp = ((int) (Math.random() % 6) + 1);
    }

    public void rollD3() {
        faceUp = ((int) (Math.random() % 3) +1);
    }

    public void rollD2() {
        faceUp = ((int) (Math.random() % 2) + 1);
    }

    public int getFaceUp() {
        return faceUp;
    }
}
