package edu.wit.mobileapp.cardview;

public class ListElement {
    private String color;
    private String name;
    private String city;

    public ListElement(String color, String name, String city) {
        this.color = color;
        this.name = name;
        this.city = city;
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

}
