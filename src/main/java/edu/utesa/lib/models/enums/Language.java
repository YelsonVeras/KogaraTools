package edu.utesa.lib.models.enums;

public enum Language {
    ENGLISH("en"), SPANISH("es");

    String internationalization;

    Language(String internationalization) {
        this.internationalization = internationalization;
    }
}
