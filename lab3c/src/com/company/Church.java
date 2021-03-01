package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {
    private LocalTime openingTime, closingTime;
    private int age;
    private String saint;

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSaint() {
        return saint;
    }

    public void setSaint(String saint) {
        this.saint = saint;
    }

    public Church() {
        age=200;
        saint="Vasile";
    }

    public Church(LocalTime openingTime, LocalTime closingTime, int age, String saint) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.age = age;
        this.saint = saint;
    }

    @Override
    public String toString() {
        return "Church{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", age=" + age +
                ", saint='" + saint + '\'' +
                '}';
    }
}
