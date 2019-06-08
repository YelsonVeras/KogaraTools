package edu.utesa.lib.models.dtos.contact;

import edu.utesa.lib.models.enums.type.ContactType;

public class ContactDto {
    private ContactType type;
    private String value;

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}