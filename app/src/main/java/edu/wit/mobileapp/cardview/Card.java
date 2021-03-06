package edu.wit.mobileapp.cardview;
import android.graphics.Bitmap;

/**
 * This object represents each individual card
 * @author Samuel Hernandez
 */
public class Card {

    private Bitmap image;
    private String title, description;

    public Card(Bitmap image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    //Getters
    public Bitmap getImage() { return image; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
}
