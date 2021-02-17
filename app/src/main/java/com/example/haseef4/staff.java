package com.example.haseef4;

public class staff {
    private String age;
    private String location;
    private String staffName;
    private String working_since;
    private String staffID;

    public staff(String Age,String Location,String Name,String Working_since){
        this.age=age;
        this.location=location;
        this.staffName=staffName;
        this.working_since=working_since;
    }

    public String getage() {
        return age;
    }

    public String getlocation() {
        return location;
    }

    public String getstaffName() {
        return staffName;
    }

    public String getworking_since() {
        return working_since;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setage(String age) {
        age = age;
    }

    public void setlocation(String location) {
        location = location;
    }

    public void setstaffName(String name) {
        staffName = staffName;
    }

    public void setworking_since(String working_since) {
        working_since = working_since;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
}
