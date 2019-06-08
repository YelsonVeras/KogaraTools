package edu.utesa.lib.models.dtos.mail;

import java.util.Date;

public class ForgotPasswordDto {
    private String keyLost;
    private String email;
    private Date requestDate;

    public String getKeyLost() {
        return keyLost;
    }

    public void setKeyLost(String keyLost) {
        this.keyLost = keyLost;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}
