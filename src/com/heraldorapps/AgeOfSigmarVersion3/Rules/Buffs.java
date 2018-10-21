package com.heraldorapps.AgeOfSigmarVersion3.Rules;

public class Buffs {
    private int saveBuff = 0;
    private int moveBuff = 0;
    private int braveryBuff = 0;
    private int woundsBuff = 0;

    private int rangeBuff = 0;
    private int attacksBuff = 0;
    private int hitBuff = 0;
    private int woundBuff = 0;
    private int rendBuff = 0;
    private int damageBuff = 0;

    public int getSaveBuff() {
        return saveBuff;
    }

    public void setSaveBuff(int saveBuff) {
        this.saveBuff = saveBuff;
    }

    public int getMoveBuff() {
        return moveBuff;
    }

    public void setMoveBuff(int moveBuff) {
        this.moveBuff = moveBuff;
    }

    public int getBraveryBuff() {
        return braveryBuff;
    }

    public void setBraveryBuff(int braveryBuff) {
        this.braveryBuff = braveryBuff;
    }

    public int getWoundsBuff() {
        return woundsBuff;
    }

    public void setWoundsBuff(int woundsBuff) {
        this.woundsBuff = woundsBuff;
    }

    public int getRangeBuff() {
        return rangeBuff;
    }

    public void setRangeBuff(int rangeBuff) {
        this.rangeBuff = rangeBuff;
    }

    public int getAttacksBuff() {
        return attacksBuff;
    }

    public void setAttacksBuff(int attacksBuff) {
        this.attacksBuff = attacksBuff;
    }

    public int getHitBuff() {
        return hitBuff;
    }

    public void setHitBuff(int hitBuff) {
        this.hitBuff = hitBuff;
    }

    public int getWoundBuff() {
        return woundBuff;
    }

    public void setWoundBuff(int woundBuff) {
        this.woundBuff = woundBuff;
    }

    public int getRendBuff() {
        return rendBuff;
    }

    public void setRendBuff(int rendBuff) {
        this.rendBuff = rendBuff;
    }

    public int getDamageBuff() {
        return damageBuff;
    }

    public void setDamageBuff(int damageBuff) {
        this.damageBuff = damageBuff;
    }

    public void buffHit (int increment) {
        hitBuff += increment;
    }
}
