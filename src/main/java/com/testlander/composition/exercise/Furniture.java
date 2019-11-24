package com.testlander.composition.exercise;

public class Furniture {
    private int sofa;
    private int chair;
    private int table;

    public Furniture(int sofa, int chair, int table) {
        this.sofa = sofa;
        this.chair = chair;
        this.table = table;
    }

    public void nameSofaModel() {
        System.out.println("Furniture.getSofaModel() called: King");
    }

    public int getSofa() {
        return sofa;
    }

    public int getChair() {
        return chair;
    }

    public int getTable() {
        return table;
    }
}
