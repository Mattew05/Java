package com.company;

public class Problem {
    private int costPerUnit;
    Source source;
    Destination destination;

    public Problem(Source source,Destination destination,int value){
        this.source=source;
        this.destination=destination;
        costPerUnit=value;
    }

    //setters
    public void setCostPerUnit(int costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    //getters
    public Destination getDestination() {
        return destination;
    }

    public int getCostPerUnit() {
        return costPerUnit;
    }

    public Source getSource() {
        return source;
    }

    //suprascriere tostring
    public String toString() {
        return "The cost from " + source.getName() + " to " + destination.getName() + " is " + costPerUnit;
    }

}
