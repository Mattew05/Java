package com.company;

public class Source {
    //variabile private
    public enum SourceType {
        WAREHOUSE, FACTORY;
    }
    private SourceType sourceType;
    private String Name;
    private int supply;

    //constructor
    public Source(SourceType sourceType,String Name,int supply){
        this.sourceType=sourceType;
        this.Name=Name;
        this.supply=supply;
    }

    //setters
    public void setName(String name) {
        Name = name;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    //getters
    public String getName() {
        return Name;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public int getSupply() {
        return supply;
    }

    //suprascriere tostring
    public String toString() {
        return Name + " which is a " + sourceType + " has the supply capacity of " + supply + " units.";
    }
}
