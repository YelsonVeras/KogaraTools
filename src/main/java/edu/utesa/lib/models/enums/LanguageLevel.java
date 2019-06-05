package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum LanguageLevel {
    BAD,
    BASIC,
    INTERMEDIATE,
    ADVANCED;

    @Override
    public String toString() {
        switch (this) {
            case BAD:
                return I18n.getText(EnumCaption.BAD);
            case BASIC:
                return I18n.getText(EnumCaption.BASIC);
            case INTERMEDIATE:
                return I18n.getText(EnumCaption.INTERMEDIATE);
            case ADVANCED:
                return I18n.getText(EnumCaption.ADVANCED);
        }
        return "";
    }
}
