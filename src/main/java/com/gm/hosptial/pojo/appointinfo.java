package com.gm.hosptial.pojo;

public class appointinfo {
    private String patientid;

    private String doctorid;

    private String hao;

    private String number;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid == null ? null : doctorid.trim();
    }

    public String getHao() {
        return hao;
    }

    public void setHao(String hao) {
        this.hao = hao == null ? null : hao.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}