package com.webianks.task.playstoreparalleldownload;

/**
 * Created by R Ankit on 30-03-2017.
 */

class Apps {

    String appName;
    int appLogo;
    float stars;

    public void setAppLogo(int appLogo) {
        this.appLogo = appLogo;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public float getStars() {
        return stars;
    }

    public int getAppLogo() {
        return appLogo;
    }

    public String getAppName() {
        return appName;
    }
}
