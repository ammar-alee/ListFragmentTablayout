package com.example.ammarali.practicetablayout;

/**
 * Created by Ammar.Ali on 10/30/16.
 */

public class ListItem {

    private String heading;
    private String randomText;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getRandomText() {
        return randomText;
    }

    public void setRandomText(String randomText) {
        this.randomText = randomText;
    }

    @Override
    public String toString() {
        return "Heading=" + heading + ", Random Text=" + randomText + "";
    }
}

