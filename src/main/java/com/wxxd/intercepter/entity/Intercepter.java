package com.wxxd.intercepter.entity;

public class Intercepter {
    private String ip;
    private String time;
    private String interfaceName;

    public Intercepter(String ip, String time, String interfaceName) {
        this.ip = ip;
        this.time = time;
        this.interfaceName = interfaceName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getIp() {
        return ip;
    }

    public String getTime() {
        return time;
    }

    public String getInterfaceName() {
        return interfaceName;
    }
}
