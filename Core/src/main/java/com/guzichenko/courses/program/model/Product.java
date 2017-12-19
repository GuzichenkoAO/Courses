package com.guzichenko.courses.program.model;

import java.util.Objects;

public class Product {

    private String name;
    private String factory;
    private int value;

    public Product(String name, String factory, int value) {
        this.name = name;
        this.factory = factory;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getValue() == product.getValue() &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getFactory(), product.getFactory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFactory(), getValue());
    }
}
