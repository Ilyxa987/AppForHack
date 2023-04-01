package com.example.appforhack;

public class Achievement {
    String title;
    String description;
    int coverId;

    public Achievement(String title, String description, int coverId) {
        this.title = title;
        this.description = description;
        this.coverId = coverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoverId() {
        return coverId;
    }

    public void setCoverId(int coverId) {
        this.coverId = coverId;
    }
}
