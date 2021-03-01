package com.company;

public class Hotel extends Location implements Classifiable{
    private int rank;
    private int pricePerNight;
    private int noStars;
    @Override
    public int getRank(){
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNoStars() {
        return noStars;
    }

    public void setNoStars(int noStars) {
        this.noStars = noStars;
    }

    public Hotel() {
        pricePerNight=50;
        noStars=2;
    }

    public Hotel(int rank, int pricePerNight, int noStars) {
        this.rank = rank;
        this.pricePerNight = pricePerNight;
        this.noStars = noStars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rank=" + rank +
                ", pricePerNight=" + pricePerNight +
                ", noStars=" + noStars +
                '}';
    }
}
