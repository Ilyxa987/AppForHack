package com.example.appforhack;

import android.widget.ProgressBar;

public class Achievement {
    String title;
    String description;
    int coverId;
    int percent;
    int progressBarId;

    public Achievement(String title, String description, int coverId, int percent) {
        this.title = title;
        this.description = description;
        this.coverId = coverId;
        this.percent = percent;
        //this.progressBarId = progressBarId;
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

    public int getPercent() {
        return percent;
    }
}
