package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Kindred {
    FATHER,
    MOTHER,
    TUTOR,
    SISTER,
    BROTHER,
    GRANDMOTHER,
    GRANDFATHER,
    FRIENDSHIP,
    ENGAGEMENT,
    OTHER;

    @Override
    public String toString() {
        switch (this) {
            case FATHER:
                return I18n.getText(EnumCaption.FATHER);
            case MOTHER:
                return I18n.getText(EnumCaption.MOTHER);
            case TUTOR:
                return I18n.getText(EnumCaption.TUTOR);
            case SISTER:
                return I18n.getText(EnumCaption.SISTER);
            case BROTHER:
                return I18n.getText(EnumCaption.BROTHER);
            case GRANDMOTHER:
                return I18n.getText(EnumCaption.GRANDMOTHER);
            case GRANDFATHER:
                return I18n.getText(EnumCaption.GRANDFATHER);
            case FRIENDSHIP:
                return I18n.getText(EnumCaption.FRIENDSHIP);
            case ENGAGEMENT:
                return I18n.getText(EnumCaption.ENGAGEMENT);
            case OTHER:
                return I18n.getText(EnumCaption.OTHER);
        }
        return "";
    }
}
