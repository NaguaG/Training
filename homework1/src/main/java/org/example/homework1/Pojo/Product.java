package org.example.homework1.Pojo;

public class Product {
    public String id;
    public String name;
    public Data data;

    public Product(String id, String name, Data data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
