package com.example.goku.readwrite;

/**
 * Created by goku on 21/10/16.
 */

public class Message {

    private String alert_msg;
    private  String info_msg;

    public String getInfo_msg() {
        return info_msg;
    }

    public void setInfo_msg(String info_msg) {
        this.info_msg = info_msg;
    }

    public String getAlert_msg() {
        return alert_msg;
    }

    public void setAlert_msg(String alert_msg) {
        this.alert_msg = alert_msg;
    }
}
