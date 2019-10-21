package com.gm.hosptial.pojo;

public class appointrecord {
    private String appointnumber;

    private String patientid;

    private String appointtime;

    private String appointstatus;

    private String number;

    public String getAppointnumber() {
        return appointnumber;
    }

    public void setAppointnumber(String appointnumber) {
        this.appointnumber = appointnumber == null ? null : appointnumber.trim();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getAppointtime() {
        return appointtime;
    }

    public void setAppointtime(String appointtime) {
        this.appointtime = appointtime == null ? null : appointtime.trim();
    }

    public String getAppointstatus() {
        return appointstatus;
    }

    public void setAppointstatus(String appointstatus) {
        this.appointstatus = appointstatus == null ? null : appointstatus.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}