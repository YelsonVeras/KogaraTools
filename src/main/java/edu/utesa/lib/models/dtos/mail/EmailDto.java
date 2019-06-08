package edu.utesa.lib.models.dtos.mail;

public class EmailDto {
    private String emailID;
    private String message;

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}