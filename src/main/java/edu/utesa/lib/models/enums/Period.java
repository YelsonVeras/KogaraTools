package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Period {
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR;

    @Override
    public String toString() {
        switch (this) {
            case HOUR:
                return I18n.getText(EnumCaption.HOUR);
            case DAY:
                return I18n.getText(EnumCaption.DAY);
            case WEEK:
                return I18n.getText(EnumCaption.WEEK);
            case MONTH:
                return I18n.getText(EnumCaption.MONTH);
            case YEAR:
                return I18n.getText(EnumCaption.YEAR);
        }
        return "";
    }
}

