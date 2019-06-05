package edu.utesa.lib.models.enums;

public enum SID {
    PROGRAM("AP01"),
    LEGAL_SERVICE("AL01"),
    FORM("AF01"),
    CONSULATE("AC01"),
    GENERIC("BG01"),
    UNIT("UU01"),
    EVALUATE("AE01"),
    DOLLAR("CD01"),
    PESO_DOM("CP01"),
    EVALUATION("EE01");

    String sid;

    SID(String sid) {
        this.sid = sid;
    }
}
