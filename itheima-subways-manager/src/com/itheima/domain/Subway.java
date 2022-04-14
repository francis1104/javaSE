package com.itheima.domain;

public class Subway {
    private String subwayCode;
    private String subwayName;
    private String subwayRoute;

    @Override
    public String toString() {
        return subwayCode+","+subwayName+","+subwayRoute;
    }

    public Subway() {
    }

    public Subway(String subwayCode, String subwayName, String subwayRoute) {
        this.subwayCode = subwayCode;
        this.subwayName = subwayName;
        this.subwayRoute = subwayRoute;
    }

    public String getSubwayCode() {
        return subwayCode;
    }

    public void setSubwayCode(String subwayCode) {
        this.subwayCode = subwayCode;
    }

    public String getSubwayName() {
        return subwayName;
    }

    public void setSubwayName(String subwayName) {
        this.subwayName = subwayName;
    }

    public String getSubwayRoute() {
        return subwayRoute;
    }

    public void setSubwayRoute(String subwayRoute) {
        this.subwayRoute = subwayRoute;
    }
}
