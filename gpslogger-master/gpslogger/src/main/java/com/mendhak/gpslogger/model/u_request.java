package com.mendhak.gpslogger.model;

public class u_request {
    private String Visit_Date;
    private String from_time;
    private String to_time;

    public String getVisit_Date() {
        return Visit_Date;
    }

    public String getFrom_time() {
        return from_time;
    }

    public String getTo_time() {
        return to_time;
    }

    public void setVisit_Date(String visit_Date) {
        Visit_Date = visit_Date;
    }

    public void setFrom_time(String from_time) {
        this.from_time = from_time;
    }

    public void setTo_time(String to_time) {
        this.to_time = to_time;
    }



    @Override
    public String toString() {
        return "u_request{" +
                "Visit_Date='" + Visit_Date + '\'' +
                ", from_time='" + from_time + '\'' +
                ", to_time='" + to_time + '\'' +
                '}';
    }
}
