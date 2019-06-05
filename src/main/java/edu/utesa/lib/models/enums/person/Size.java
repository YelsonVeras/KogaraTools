package edu.utesa.lib.models.enums.person;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE, DOUBLE_EXTRA_LARGE;

    @Override
    public String toString() {
        switch (this) {
            case SMALL:
                return I18n.getText(EnumCaption.SMALL);
            case MEDIUM:
                return I18n.getText(EnumCaption.MEDIUM);
            case LARGE:
                return I18n.getText(EnumCaption.LARGE);
            case EXTRA_LARGE:
                return I18n.getText(EnumCaption.EXTRA_LARGE);
            case DOUBLE_EXTRA_LARGE:
                return I18n.getText(EnumCaption.DOUBLE_EXTRA_LARGE);
        }
        return "";
    }
}

