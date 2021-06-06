package com.anil.cms.courseapi.status;

public class Status {

    private String version, url, status, statusCode;
    
    public Status() {
    }
    
    public Status(String version, String url, String status, String statusCode) {
        this.version = version;
        this.url = url;
        this.status = status;
        this.statusCode = statusCode;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
}
