package org.example.homework1.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    public String color;
    public String capacity;
    public double price;
    public String generation;
    public int year;
    @JsonProperty("CPU model")
    public String cpuModel;
    @JsonProperty("Hard disk size")
    public String hardDiskSize;

    public Data(String color, String capacity, double price, String generation, int year, String cpuModel, String hardDiskSize) {
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.generation = generation;
        this.year = year;
        this.cpuModel = cpuModel;
        this.hardDiskSize = hardDiskSize;
    }

    public String getColor() {
        return color;
    }

    public String getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public String getGeneration() {
        return generation;
    }

    public int getYear() {
        return year;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
}
