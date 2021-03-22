package com.company;

import com.company.module2.inheritance.Circle;
import com.company.module2.inheritance.Monitor;

import java.time.LocalDate;

/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Main
  @version  1.0.0 
  @since 22.03.2021 - 11.17
**/

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(20.5);
        System.out.println("Area of circle sector: " + circle.getAreaOfSector(3));
        System.out.println(circle);

        Monitor monitor = new Monitor("1920:1080","IPS",60,false,1999.99);
        System.out.println(monitor);

        Monitor monitor1 = new Monitor(40,50,"1920:1080","TN",120,
                true,1999.99);
        System.out.println(monitor1);

    }
    /* Output:
        Area of circle sector: 630.375
        Circle{Figure{description='null'}, radius=20.5}
        Monitor{Rectangle{length = 0, width = 0}, resolution='1920:1080', matrixType='IPS', refreshRate=60, hasSpeakers=false, price=1999.99}
        Monitor{Rectangle{length = 40, width = 50}, resolution='1920:1080', matrixType='TN', refreshRate=120, hasSpeakers=true, price=1999.99}
     */

}
