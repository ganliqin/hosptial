package com.gm.hosptial.pojo;

public class patientinfo {
    private String patientid;

    private Integer tid;

    private String patientname;

    private String patientphone;

    private String patientsex;

    private Integer patientstatus;

    private String id;

    private String password;

    private Integer freezetime;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public String getPatientphone() {
        return patientphone;
    }

    public void setPatientphone(String patientphone) {
        this.patientphone = patientphone == null ? null : patientphone.trim();
    }

    public String getPatientsex() {
        return patientsex;
    }

    public void setPatientsex(String patientsex) {
        this.patientsex = patientsex == null ? null : patientsex.trim();
    }

    public Integer getPatientstatus() {
        return patientstatus;
    }

    public void setPatientstatus(Integer patientstatus) {
        this.patientstatus = patientstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getFreezetime() {
        return freezetime;
    }

    public void setFreezetime(Integer freezetime) {
        this.freezetime = freezetime;
    }
}