package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ParticipantStatus {
    REGISTER,
    WAITING,
    APPLICANT,
    ACCEPT,
    BAD_ENGLISH,
    EMPLOYED,
    REJECTED,
    BURNED,
    DISABLED;

    @Override
    public String toString() {
        switch (this) {
            case REGISTER:
                return I18n.getText(EnumCaption.REGISTER);
            case APPLICANT:
                return I18n.getText(EnumCaption.VALID);
            case WAITING:
                return I18n.getText(EnumCaption.WAITING);
            case ACCEPT:
                return I18n.getText(EnumCaption.ACCEPT);
            case EMPLOYED:
                return I18n.getText(EnumCaption.WITH_SPONSOR);
            case REJECTED:
                return I18n.getText(EnumCaption.REJECTED);
            case BURNED:
                return I18n.getText(EnumCaption.BURNED);
            case DISABLED:
                return I18n.getText(EnumCaption.DISABLED);
            case BAD_ENGLISH:
                return I18n.getText(EnumCaption.BAD_ENGLISH);
        }
        return "";
    }


}