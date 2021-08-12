package com.hao.pojo;

public class Message {
    String account;
    String message;
    String constructDate;

    @Override
    public String toString() {
        return "Message{" +
                "account='" + account + '\'' +
                ", message='" + message + '\'' +
                ", constructDate='" + constructDate + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getConstructDate() {
        return constructDate;
    }

    public void setConstructDate(String constructDate) {
        this.constructDate = constructDate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
