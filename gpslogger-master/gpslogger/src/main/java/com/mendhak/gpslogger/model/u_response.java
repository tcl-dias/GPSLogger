package com.mendhak.gpslogger.model;

public class u_response {

    private String status;
    private String accuracy ;
    private String time_saved;
    private String user_id;
    private String latitude;
    private String longitude;
    private String route_id;
    private String time;
    private String date;
    private String google_point;

    public String getStatus() {
        return status;
    }

    public String getTime_saved() {
        return time_saved;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
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

    public String getGoogle_point() {
        return google_point;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public void setTime_saved(String time_saved) {
        this.time_saved = time_saved;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
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

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public void setGoogle_point(String google_point) {
        this.google_point = google_point;
    }

    @Override
    public String toString() {
        return "u_response{" +
                "status='" + status + '\'' +
                ", accuracy='" + accuracy + '\'' +
                ", time_saved='" + time_saved + '\'' +
                ", user_id='" + user_id + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", route_id='" + route_id + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", google_point='" + google_point + '\'' +
                '}';
    }
}
