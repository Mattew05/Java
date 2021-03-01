package com.company;

import java.util.HashMap;

public abstract class Location implements Comparable<Location>
{
    private String name;
    private String Description;
    private String postalCode;

    private HashMap<Location, Integer> cost;
    //… constructors, getters, setters


    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public HashMap<Location, Integer> getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCost(HashMap<Location, Integer> cost) {
        this.cost = cost;
    }//overloading pentru ailalta

    public Location() {
        cost = new HashMap<Location, Integer>();
    }

    public Location(String name, String description, String postalCode, HashMap<Location, Integer> cost) {
        this.name = name;
        Description = description;
        this.postalCode = postalCode;
        this.cost = cost;
        cost = new HashMap<Location, Integer>();
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }
    //… toString, etc.


    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Location other) {
        if(this.name==null||other.name==null)return -5;
        return this.name.compareTo(other.name);
//not safe, check if name is null before
    }
}