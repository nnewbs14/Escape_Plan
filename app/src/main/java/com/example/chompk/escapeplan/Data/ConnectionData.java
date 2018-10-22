package com.example.chompk.escapeplan.Data;

public class ConnectionData {

    private int port;
    private String ipAddress;
    private static final ConnectionData ourInstance = new ConnectionData();

    public static ConnectionData getInstance() {
        return ourInstance;
    }

    private ConnectionData() {
        ipAddress = "localhost";
        port = 6666;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}