package com.contact.entity;

public class Contact {
    private Long cId;
    private Long userId;
    private String email;
    private String contactName;

    public Contact(Long cId, Long userId, String email, String contactName) {
        this.cId = cId;
        this.userId = userId;
        this.email = email;
        this.contactName = contactName;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
