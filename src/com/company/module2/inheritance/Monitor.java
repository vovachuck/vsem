package com.company.module2.inheritance;

import com.company.module2.design.Rectangle;

/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Monitor
  @version  1.0.0 
  @since 22.03.2021 - 10.46
**/

public class Monitor extends Rectangle {

    private String resolution;
    private String matrixType; //Type of display matrix like IPS, TN or VA
    private int refreshRate;
    private boolean hasSpeakers;
    private double price;

    public Monitor() {
    }

    public Monitor(String resolution, String matrixType, int refreshRate,
                   boolean hasSpeakers, double price) {
        this.resolution = resolution;
        this.matrixType = matrixType;
        this.refreshRate = refreshRate;
        this.hasSpeakers = hasSpeakers;
        this.price = price;
    }

    public Monitor(int length, int width, String resolution, String matrixType,
                   int refreshRate, boolean hasSpeakers, double price) {
        super(length, width);
        this.resolution = resolution;
        this.matrixType = matrixType;
        this.refreshRate = refreshRate;
        this.hasSpeakers = hasSpeakers;
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isHasSpeakers() {
        return hasSpeakers;
    }

    public void setHasSpeakers(boolean hasSpeakers) {
        this.hasSpeakers = hasSpeakers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                ", resolution='" + resolution + '\'' +
                ", matrixType='" + matrixType + '\'' +
                ", refreshRate=" + refreshRate +
                ", hasSpeakers=" + hasSpeakers +
                ", price=" + price +
                '}';
    }
}