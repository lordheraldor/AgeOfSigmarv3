package com.heraldorapps.AgeOfSigmarVersion3.Unit_Data;

import com.heraldorapps.AgeOfSigmarVersion3.Rules.Buffs;

public abstract class Unit {

    private boolean canFly;
    private boolean hasRangedWeapon;

    private int WOUNDS_PER_MODEL;
    private int SAVE;
    private int MOVE;
    private int BRAVERY;

    private int range;
    private int attacks;
    private int hit;
    private int wound;
    private int rend;
    private int damage;

    public int getWOUNDS_PER_MODEL() {
        return WOUNDS_PER_MODEL;
    }

    public void setWOUNDS_PER_MODEL(int WOUNDS_PER_MODEL) {
        this.WOUNDS_PER_MODEL = WOUNDS_PER_MODEL;
    }

    public int getSAVE() {
        return SAVE;
    }

    public void setSAVE(int SAVE) {
        this.SAVE = SAVE;
    }

    public int getMOVE() {
        return MOVE;
    }

    public void setMOVE(int MOVE) {
        this.MOVE = MOVE;
    }

    public int getBRAVERY() {
        return BRAVERY;
    }

    public void setBRAVERY(int BRAVERY) {
        this.BRAVERY = BRAVERY;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAttacks() {
        return attacks;
    }

    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getWound() {
        return wound;
    }

    public void setWound(int wound) {
        this.wound = wound;
    }

    public int getRend() {
        return rend;
    }

    public void setRend(int rend) {
        this.rend = rend;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean getHasRangedWeapon() {
        return hasRangedWeapon;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void setHasRangedWeapon(boolean hasRangedWeapon) {
        this.hasRangedWeapon = hasRangedWeapon;
    }

    public boolean getCanFly() {
        return canFly;
    }

}
