package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ParticipantItemInformation {
    PERSON,
    CONTACTS,
    ADDRESS,
    LANGUAGE,
    EDUCATION,
    EXPERIENCE,
    PASSPORT,
    VISA,
    FAMILY,
    MISCELLANEOUS,
    GUARANTOR,
    PROGRAM,
    APPOINTMENTS;

    @Override
    public String toString() {
        switch (this) {
            case PERSON:
                return I18n.getText(EnumCaption.PERSONNEL_INF);
            case CONTACTS:
                return I18n.getText(EnumCaption.CONTACTS);
            case ADDRESS:
                return I18n.getText(EnumCaption.PARTICIPANT_ADDRESS);
            case LANGUAGE:
                return I18n.getText(EnumCaption.LANGUAGE);
            case EDUCATION:
                return I18n.getText(EnumCaption.EDUCATION);
            case EXPERIENCE:
                return I18n.getText(EnumCaption.EXPERIENCE);
            case PASSPORT:
                return I18n.getText(EnumCaption.PASSPORT_USA);
            case VISA:
                return I18n.getText(EnumCaption.VISA);
            case FAMILY:
                return I18n.getText(EnumCaption.FAMILY);
            case MISCELLANEOUS:
                return I18n.getText(EnumCaption.MISCELLANEOUS);
            case APPOINTMENTS:
                return I18n.getText(EnumCaption.APPOINTMENTS);
            case GUARANTOR:
                return I18n.getText(EnumCaption.GUARANTOR);
            case PROGRAM:
                return I18n.getText(EnumCaption.PROGRAM);
        }
        return "";
    }
}
