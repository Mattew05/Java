package com.company;

public class Restaurant extends Location implements Classifiable{
    private int rank;
    private int noEaters;
    private int noFoods;

    public int getNoEaters() {
        return noEaters;
    }

    public int getNoFoods() {
        return noFoods;
    }

    public void setNoEaters(int noEaters) {
        this.noEaters = noEaters;
    }

    public void setNoFoods(int noFoods) {
        this.noFoods = noFoods;
    }

    @Override
    public int getRank(){
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Restaurant() {
        noEaters=100;
        noFoods=20;
    }

    public Restaurant(int rank, int noEaters, int noFoods) {
        this.rank = rank;
        this.noEaters = noEaters;
        this.noFoods = noFoods;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "rank=" + rank +
                ", noEaters=" + noEaters +
                ", noFoods=" + noFoods +
                '}';
    }
}
