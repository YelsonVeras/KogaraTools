package edu.utesa.lib.models.dtos.document;

import edu.utesa.lib.models.enums.type.DocumentType;

public class DocumentDto {
    private String value;
    private DocumentType type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }
}