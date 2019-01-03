package com.cyberdime.quake;

public class Earthquake {
private Double magt;
private String city;
private long date;
private String url;

public Earthquake(Double magt, String city, long date,String url){
   this.magt=magt ;
   this.city=city;
   this.date=date;
   this.url=url;
    }

    public Double getMagt() {
        return magt;
    }

    public String getCity() {
        return city;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
