package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Museum m = new Museum();
        m.setOpeningTime(LocalTime.of(9, 30)); //9:30
        m.setClosingTime(LocalTime.parse("17:00"));
        m.setTicketPrice(20);

        Church c = new Church();
        c.setOpeningTime(LocalTime.of(7, 0));
        c.setClosingTime(LocalTime.MIDNIGHT);


        Hotel v1=new Hotel(3,150,3);
        Museum v2=new Museum(LocalTime.of(8,30),LocalTime.of(19,0),20,"macarenaDances");
        Museum v3=new Museum(LocalTime.of(10,0),LocalTime.of(21,0),30,"aserejeDances");
        Church v4=new Church(LocalTime.of(7,0),LocalTime.of(19,0),300,"Giorgica");
        Church v5=new Church(LocalTime.of(8,0),LocalTime.of(21,0),200,"Giorgica v2");
        Restaurant v6=new Restaurant(3,200,30);
    }
}
