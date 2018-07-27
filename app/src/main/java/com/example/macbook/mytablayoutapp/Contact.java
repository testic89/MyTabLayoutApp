package com.example.macbook.mytablayoutapp;


import android.widget.ImageView;

public class Contact {

    private String name;
    private String userCategory;
    private String imageURL;

    public Contact(String name, String userCategory, String imageURL) {
        this.name = name;
        this.userCategory = userCategory;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
