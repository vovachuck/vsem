package com.company.module2.inheritance;

import com.company.module2.design.Figure;

import java.util.Objects;

/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Circle
  @version  1.0.0 
  @since 22.03.2021 - 16.04
**/

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getLength(){
        return Math.PI * 2 * this.radius;
    }

    public double getAreaOfSector(double sectorAngleInRadians){

        double angleInDegrees = Math.toDegrees(sectorAngleInRadians);

        return getArea() * angleInDegrees / 360;
    }

    public double getChordLength(double angleInRadians){

        double angleInDegrees = Math.toDegrees(angleInRadians);

        return 2 * this.radius * Math.sin(angleInDegrees/2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
