package com.hao.pojo;

public class Auditor {
    String auditorAccount;
    String userAccount;
    int status;
    String constructDate;

    @Override
    public String toString() {
        return "Auditor{" +
                "auditorAccount='" + auditorAccount + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", status=" + status +
                ", constructDate='" + constructDate + '\'' +
                '}';
    }

    public String getConstructDate() {
        return constructDate;
    }

    public void setConstructDate(String constructDate) {
        this.constructDate = constructDate;
    }

    public String getAuditorAccount() {
        return auditorAccount;
    }

    public void setAuditorAccount(String auditorAccount) {
        this.auditorAccount = auditorAccount;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
