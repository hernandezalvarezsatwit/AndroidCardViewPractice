package edu.wit.mobileapp.cardview;

public class ListElement {
    private String color;
    private String name;
    private String city;
    private String status;

    public ListElement(String color, String name, String city, String status) {
        this.color = color;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }
}
