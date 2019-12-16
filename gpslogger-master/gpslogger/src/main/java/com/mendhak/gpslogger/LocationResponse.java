package com.mendhak.gpslogger;

public class LocationResponse {
    private String status;
    private String time_saved;
    private String user_id;
    private float latitude;
    private float longitude;
    private String route_id;
    private String time;
    private String date;
    private float google_point;
    private float accuracy;


    // Getter Methods

    public String getStatus() {
        return status;
    }

    public String getTime_saved() {
        return time_saved;
    }

    public String getUser_id() {
        return user_id;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getRoute_id() {
        return route_id;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public float getGoogle_point() {
        return google_point;
    }

    public float getAccuracy() {
        return accuracy;
    }

    // Setter Methods

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime_saved(String time_saved) {
        this.time_saved = time_saved;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGoogle_point(float google_point) {
        this.google_point = google_point;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }
}
