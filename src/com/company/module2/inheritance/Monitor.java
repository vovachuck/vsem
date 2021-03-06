package com.company.module2.inheritance;

import com.company.module2.design.Rectangle;

import java.util.Objects;

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
    private double productionCost;

    public Monitor() {
    }

    public Monitor(String resolution, String matrixType, int refreshRate,
                   boolean hasSpeakers, double productionCost) {
        this.resolution = resolution;
        this.matrixType = matrixType;
        this.refreshRate = refreshRate;
        this.hasSpeakers = hasSpeakers;
        this.productionCost = productionCost;
    }

    public Monitor(int length, int width, String resolution, String matrixType,
                   int refreshRate, boolean hasSpeakers, double productionCost) {
        super(length, width);
        this.resolution = resolution;
        this.matrixType = matrixType;
        this.refreshRate = refreshRate;
        this.hasSpeakers = hasSpeakers;
        this.productionCost = productionCost;
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

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                ", resolution='" + resolution + '\'' +
                ", matrixType='" + matrixType + '\'' +
                ", refreshRate=" + refreshRate +
                ", hasSpeakers=" + hasSpeakers +
                ", productionCost=" + productionCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return refreshRate == monitor.refreshRate && hasSpeakers == monitor.hasSpeakers && Double.compare(monitor.productionCost, productionCost) == 0 && resolution.equals(monitor.resolution) && matrixType.equals(monitor.matrixType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolution, matrixType, refreshRate, hasSpeakers, productionCost);
    }

    public double getPrice(){

        if(matrixType.equals("IPS")){
            return refreshRate * 0.1 + productionCost;
        }

        return refreshRate * 0.05 + productionCost;
    }

}
