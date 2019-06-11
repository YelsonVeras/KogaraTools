package edu.utesa.lib.models.enums;

public enum Language {
    ENGLISH("en"), SPANISH("es");

    public String internationalization;

    Language(String internationalization) {
        this.internationalization = internationalization;
    }
}
