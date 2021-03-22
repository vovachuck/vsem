package com.company.module2.design;
/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Figure
  @version  1.0.0 
  @since 22.03.2021 - 16.22
**/

import java.util.Objects;

public class Figure {
    private String description;

    public Figure() {
    }

    public Figure(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(description, figure.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
