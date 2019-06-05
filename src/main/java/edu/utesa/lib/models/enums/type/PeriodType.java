package edu.utesa.lib.models.enums.type;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum PeriodType {
    BIMESTER, TRIMESTER, QUARTER, SEMESTER;

    public @Override
    String toString() {
        switch (this) {
            case BIMESTER:
                return I18n.getText(EnumCaption.BIMESTER);
            case TRIMESTER:
                return I18n.getText(EnumCaption.TRIMESTER);
            case QUARTER:
                return I18n.getText(EnumCaption.QUARTER);
            case SEMESTER:
                return I18n.getText(EnumCaption.SEMESTER);
        }
        return "";
    }
}

