package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Days {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    int value;

    Days(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        switch (this) {
            case MONDAY:
                return I18n.getText(EnumCaption.MONDAY);
            case TUESDAY:
                return I18n.getText(EnumCaption.TUESDAY);
            case WEDNESDAY:
                return I18n.getText(EnumCaption.WEDNESDAY);
            case THURSDAY:
                return I18n.getText(EnumCaption.THURSDAY);
            case FRIDAY:
                return I18n.getText(EnumCaption.FRIDAY);
            case SATURDAY:
                return I18n.getText(EnumCaption.SATURDAY);
            case SUNDAY:
                return I18n.getText(EnumCaption.SUNDAY);
        }
        return "";
    }
}

