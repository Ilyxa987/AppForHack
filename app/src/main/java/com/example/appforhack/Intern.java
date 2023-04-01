package com.example.appforhack;

public class Intern {

    String title;
    String description;
    int coverId;

    public Intern(String title, String description, int coverId) {
        this.title = title;
        this.description = description;
        this.coverId = coverId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCoverId() {
        return coverId;
    }
}
