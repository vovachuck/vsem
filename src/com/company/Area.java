package com.company;
/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Area
  @version  1.0.0 
  @since 14.03.2021 - 11.42
**/

public class Area {

    public static double getArea(int amountOfSteps, int lastCipher){

        double startPos = 0;
        double endPos = Math.PI;
        double step = (endPos - startPos) / amountOfSteps;
        double secant = lastCipher * 0.1;
        double area = 0;
        double height = 0;

        for (int i = 0; i < amountOfSteps; i++) {

            height = Math.sin(i * step);

            if (height > secant){
                height = secant;
            }
            area += height * step;

        }
        return area;
    }

    public static void main(String[] args) {

        System.out.println(getArea(1000, 5));
        // Output: 1.3151446236503066
    }
}
