package com.company;

public class Item {
    private String name;
    private String path;

    public Item() {
    }

    public Item(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return name + '\'' + path + '\'';
    }
}
