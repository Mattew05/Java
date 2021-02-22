package com.company;

public class Destination {
    //variabile private
    private String Name;
    private int demand;

    //constructor
    public Destination(String Name,int demand){
        this.Name=Name;
        this.demand=demand;
    }

    //setters
    public void setName(String name) {
        Name = name;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    //getters
    public String getName() {
        return Name;
    }

    public int getDemand() {
        return demand;
    }

    //suprascriere tostring
    public String toString() {
        return Name + " has the demand of " + demand + " units.";
    }
}
