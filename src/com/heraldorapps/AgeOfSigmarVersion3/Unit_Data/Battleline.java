package com.heraldorapps.AgeOfSigmarVersion3.Unit_Data;

public abstract class Battleline extends Unit {
    boolean hasCaptain;

    protected void hasCaptain(boolean submission) {
        hasCaptain = submission;
    }

    public boolean isHasCaptain() {
        return hasCaptain;
    }

    public void setHasCaptain(boolean hasCaptain) {
        this.hasCaptain = hasCaptain;
    }
}
